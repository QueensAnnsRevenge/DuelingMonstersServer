package monsers;

import core.Monster;
import core.Tribe;

public class BlastLizard extends Monster {

    private int level;
    private Tribe tribe;
    private int attackPoints;
    private int degendPoints;
    private int hitPoints;
    private boolean flight;
    private boolean tunneling;

    public BlastLizard(){
        this.level = 2;
        this.attackPoints = 10;
        this.degendPoints = 10;
        this.hitPoints = 10;
        this.flight = false;
        this.tunneling = false;
        this.tribe = Tribe.BEAST;
    }
    @Override
    public void attack(Monster monster) {
        monster.damage(attackPoints);
    }

    @Override
    public void damage(int damage) {
        hitPoints -= damage;
    }

    @Override
    public void heal(int point) {
        hitPoints += point;
    }

    public int getLevel() {
        return level;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public int getDegendPoints() {
        return degendPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
