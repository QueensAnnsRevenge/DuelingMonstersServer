package dice;

import core.Side;
import core.Dice;

public class Dicelvl1v4 implements Dice {

    private Side[] dice = {Side.SUM, Side.SUM, Side.SUM, Side.DEF, Side.MOV, Side.SUM};

    @Override
    public Side throwDice() {
        return dice[(int)(Math.random() * 6)];
    }
}
