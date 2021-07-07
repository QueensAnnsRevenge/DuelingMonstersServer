package dice;

import core.Dice;
import core.Side;

public class Dicelvl4v1 extends Dice{

    private final Side[] dice = {Side.SUM, Side.MAG, Side.DEF, Side.TRA, Side.ATK, Side.MOV};

    @Override
    public Side throwDice() {
        return dice[(int)(Math.random() * 6)];
    }
}
