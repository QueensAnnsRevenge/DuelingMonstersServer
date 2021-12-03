package game;

import monsers.BlastLizard;

public class BattleBoard {
    private Space[][] battleFeald;
    private Space playerA;
    private Space playerB;

    public BattleBoard(){
        battleFeald = new Space[13][19];
        playerA = battleFeald[6][0];
        playerB = battleFeald[6][18];
        playerB.setPlayer(new Player());
        playerA.setPlayer(new Player());
    }

    public Space[][] getBattlefeald(){ return battleFeald; }

    public Space getPlayerA(){return playerA; }

    public Space getPlayerB(){ return playerB; }

    public Space[][] betBattleFeald(){return battleFeald; }
}
