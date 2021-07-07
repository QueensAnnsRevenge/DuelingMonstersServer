package dice;

import core.Dice;
import core.Side;

public class Dicelvl1v2 extends Dice {
    private final Side[] dice = {Side.SUM, Side.SUM, Side.SUM, Side.SUM, Side.DEF, Side.MOV};

    @Override
    public Side throwDice() throws IndexOutOfBoundsException{
        return dice[(int)(Math.random() * 6)];
    }
}
