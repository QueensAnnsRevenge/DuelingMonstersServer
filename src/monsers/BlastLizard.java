package monsers;

import core.Tribe;
import core.Monster;

public class BlastLizard implements Monster {

    private int level;
    private Tribe tribe;
    private int attackPoints;
    private int defendPoints;
    private int hitPoints;
    private boolean flight;
    private boolean tunneling;
    private int atkCrest;
    private int defCrest;


    public BlastLizard(){
        this.level = 2;
        this.attackPoints = 10;
        this.defendPoints = 10;
        this.hitPoints = 10;
        this.flight = false;
        this.tunneling = false;
        this.tribe = Tribe.BEAST;
        this.atkCrest = 0;
        this.defCrest = 0;
    }


    public void damage(int damage) {
        hitPoints -= damage;
    }


    public void heal(int point) {
        hitPoints += point;
    }

    public int getLevel() {
        return level;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public int getDefendPoints() {
        return defendPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public Tribe getTribe(){ return tribe;}

}
