package dice;

import core.Side;
import core.Dice;

public class Dicelvl2v1 implements Dice {

    private final Side[] dice = {Side.SUM, Side.SUM, Side.SUM, Side.ATK, Side.DEF, Side.MOV};

    @Override
    public Side throwDice() {
        return dice[(int)(Math.random() * 6)];
    }
}
