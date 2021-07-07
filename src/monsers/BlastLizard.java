package monsers;

import core.Monster;

public class BlastLizard extends Monster {

    private int level;
    private int attackPoints;
    private int degendPoints;
    private int hitPoints;

    public BlastLizard(){
        this.level = 2;
        this.attackPoints = 10;
        this.degendPoints = 10;
        this.hitPoints = 10;
    }
    @Override
    public void attack(Monster monster) {

    }
}
