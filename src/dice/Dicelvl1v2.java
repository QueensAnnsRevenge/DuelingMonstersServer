package dice;

import core.Dice;
import core.Side;

public class Dicelvl1v2 implements Dice {
    //niz strana
    private final Side[] dice = {Side.SUM, Side.SUM, Side.SUM, Side.SUM, Side.DEF, Side.MOV};

    @Override
    public Side throwDice() throws IndexOutOfBoundsException{
        //vraca random stranu iz niza
        return dice[(int)(Math.random() * 6)];
    }
}
