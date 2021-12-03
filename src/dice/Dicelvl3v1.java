package dice;

import core.Side;
import core.Dice;

public class Dicelvl3v1 implements Dice {

    private final Side[] dice = {Side.SUM, Side.SUM, Side.DEF, Side.MAG, Side.TRA, Side.MOV};

    @Override
    public Side throwDice() {
        return dice[(int)(Math.random() * 6)];
    }
}
