package dice;

import core.Dice;
import core.Side;

public class Dicelvl1v3 extends Dice {
    private Side[] dice = {Side.SUM, Side.SUM, Side.SUM, Side.SUM, Side.MOV, Side.TRA};

    @Override
    public Side throwDice() {
        return dice[(int)(Math.random() * 6)];
    }
}
