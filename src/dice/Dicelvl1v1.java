package dice;

import core.Side;
import core.Dice;

public class Dicelvl1v1 implements Dice {

    //niz strana
    private final Side[] dice = {Side.SUM, Side.SUM, Side.SUM, Side.SUM, Side.ATK, Side.DEF};

    @Override
    public Side throwDice() throws IndexOutOfBoundsException{
        //vraca random stranu iz niza
         return dice[(int)(Math.random() * 6)];
    }
}
