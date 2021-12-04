package game;

import core.Monster;

import java.util.ArrayList;

public class BattleBoard {
    private Space[][] battleField;
    private Space playerA;
    private Space playerB;
    private ArrayList<Monster> monsters;

    public BattleBoard(){
        battleField = new Space[13][19];
        monsters = new ArrayList<>();
        initializeBoard();
        initializePlayers();
    }

    public void initializeBoard(){
        for(int i = 0; i < 13; i++){
            for (int j = 0; j < 19; j++){
                battleField[i][j] = new Space();
            }
        }
    }

    public void initializePlayers(){
        playerA = battleField[6][0];
        playerB = battleField[6][18];
        playerB.setPlayer(new Player());
        playerA.setPlayer(new Player());
    }

    public Space[][] getBattlefeald(){ return battleField; }

    public Space getPlayerA(){return playerA; }

    public Space getPlayerB(){ return playerB; }

    public Space[][] battleField(){return battleField; }
}
