package dice;

import core.Dice;
import core.Side;

public class Dicelvl2v2 extends Dice {

    private final Side[] dice = {Side.SUM, Side.SUM, Side.SUM, Side.MAG, Side.DEF, Side.MOV};

    @Override
    public Side throwDice() {
        return dice[(int)(Math.random() * 6)];
    }
}
