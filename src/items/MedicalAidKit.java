package items;

import core.Item;
import core.Monster;

public class MedicalAidKit extends Item {

    @Override
    public void effect(Monster monster){
        monster.heal(20);
    }
}
