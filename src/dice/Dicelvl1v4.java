package dice;

import core.Dice;
import core.Side;

public class Dicelvl1v4 extends Dice {

    private Side[] dice = {Side.SUM, Side.SUM, Side.SUM, Side.DEF, Side.MOV, Side.SUM};

    @Override
    public Side throwDice() {
        return dice[(int)(Math.random() * 6)];
    }
}
