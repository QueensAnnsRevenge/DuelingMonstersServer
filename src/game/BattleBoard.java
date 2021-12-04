package game;

public class BattleBoard {
    private Space[][] battleField;
    private Space playerA;
    private Space playerB;

    public BattleBoard(){
        battleField = new Space[13][19];
        playerA = battleField[6][0];
        playerB = battleField[6][18];
        playerB.setPlayer(new Player());
        playerA.setPlayer(new Player());
    }

    public Space[][] getBattlefield(){ return battleField; }

    public Space getPlayerA(){return playerA; }

    public Space getPlayerB(){ return playerB; }

    public Space[][] battleField(){return battleField; }
}
