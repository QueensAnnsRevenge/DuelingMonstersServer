package dice;

import core.Dice;
import core.Side;

public class Dicelvl3v2 extends Dice {

    private final Side[] dice = {Side.SUM, Side.SUM, Side.DEF, Side.MAG, Side.ATK, Side.MOV};

    @Override
    public Side throwDice() {
        return dice[(int)(Math.random() * 6)];
    }
}
