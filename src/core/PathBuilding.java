package core;

import game.BattleBoard;

public class PathBuilding {

//This is hopefully a temporary solution
    public static void shape1Pos1(int x, int y, BattleBoard board){
        //if(board.getBattlefeald())
        board.getBattlefield()[x][y-1].setAvailableForPlay();

    }

    public static void shape2(int x, int y){

    }
}
