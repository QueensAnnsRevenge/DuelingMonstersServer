package MainGame;

import core.Side;
import exceptions.SpaceOccupied;
import game.Actions;
import game.BattleBoard;
import game.Space;

public class GameInstance extends Thread{

    private Thread gameThread;
    private GamePhase gamePhase;
    private Actions actions;

    @Override
    public void run() {

        BattleBoard battleBoard = new BattleBoard();

        // Dokle god oba igraca imaju vise od 0 zivota
        while(battleBoard.getPlayerA().getPlayer().getLifePoints() > 0 &&
              battleBoard.getPlayerB().getPlayer().getLifePoints() > 0) {
            // Svaki potez pocinje sa bacanjem kocki.
            // Treba da se izabere nivo kocki koji ce igrac da baca.
            // Nije jos implementirana komunikacija izmedju servera
            // i klijenta. Dvojka stoji kao placeholder.
            Side[] rolledSides = actions.rollDice(2);

            // Posto klasa Player nema informaciju o broju summon crestova
            // taj podatak pamti ova promenljiva koja se resetuje na 0 cim
            // se zavrsi poted jednog od igraca.
            int numberOfSummonCrests = 0;

            // Prolazim kroz bacene strane i povecavam brojace crestova
            // prvom igracu. Nisam izbacio ogranicenje za broj crestova
            // tako da compiler trazi da stavim sve to u try/catch blok
            for (Side rolledSide : rolledSides) {
                if (rolledSide == Side.ATK) {
                    battleBoard.getPlayerA().getPlayer().addAtkCrests(1);
                } else if (rolledSide == Side.DEF) {
                    battleBoard.getPlayerA().getPlayer().addDefCrests(1);
                } else if (rolledSide == Side.MAG) {
                    battleBoard.getPlayerA().getPlayer().addMagCrests(1);
                } else if (rolledSide == Side.MOV) {
                    battleBoard.getPlayerA().getPlayer().addMovCrests(1);
                } else if (rolledSide == Side.TRA) {
                    battleBoard.getPlayerA().getPlayer().addTrpCrests(1);
                } else {
                    numberOfSummonCrests++;
                }
            }

            // Ako ima barem 2 summon cresta, onda moze da summonuje
            // sad klijent treba da odabere kog cudovista poziva,
            // opet, nema komunikacije izmedju klijenta i servera,
            // tako da ostaje prazno za sad.
            if(numberOfSummonCrests >= 2) {
                try {
                    actions.summon(null, new Space());

                } catch (SpaceOccupied spaceOccupied) {
                    spaceOccupied.printStackTrace();
                }
            }
        }

        /*
        metoda RUN {
            GameState.Playing {
                .
                .
                if(zivot == 0) {
                    promeni na GameState.GameOver
                }
            }
            GameState.GameOver {
                .
                .
                .
            }
        }
         */

    }
}
