package dice;

import core.Side;
import core.Dice;

public class Dicelvl1v3 implements Dice {
    private Side[] dice = {Side.SUM, Side.SUM, Side.SUM, Side.SUM, Side.MOV, Side.TRA};

    @Override
    public Side throwDice() {
        return dice[(int)(Math.random() * 6)];
    }
}
