package dice;

import core.Side;
import core.Dice;

public class Dicelvl3v3 implements Dice {

    private final Side[] dice = {Side.SUM, Side.SUM, Side.DEF, Side.TRA, Side.ATK, Side.MOV};

    @Override
    public Side throwDice() {
        return dice[(int)(Math.random() * 6)];
    }
}
