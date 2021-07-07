package dice;

import core.Dice;
import core.Side;

public class Dicelvl2v1 extends Dice {

    private final Side[] dice = {Side.SUM, Side.SUM, Side.SUM, Side.ATK, Side.DEF, Side.MOV};

    @Override
    public Side throwDice() {
        return dice[(int)(Math.random() * 6)];
    }
}
