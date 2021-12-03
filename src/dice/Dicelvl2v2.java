package dice;

import core.Side;
import core.Dice;

public class Dicelvl2v2 implements Dice {

    private final Side[] dice = {Side.SUM, Side.SUM, Side.SUM, Side.MAG, Side.DEF, Side.MOV};

    @Override
    public Side throwDice() {
        return dice[(int)(Math.random() * 6)];
    }
}
