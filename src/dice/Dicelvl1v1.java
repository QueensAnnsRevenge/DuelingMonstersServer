package dice;

import core.Dice;
import core.Side;

public class Dicelvl1v1 extends Dice {

    private final Side[] dice = {Side.SUM, Side.SUM, Side.SUM, Side.SUM, Side.ATK, Side.DEF};

    @Override
    public Side throwDice() throws IndexOutOfBoundsException{
         return dice[(int)(Math.random() * 6)];
    }
}
