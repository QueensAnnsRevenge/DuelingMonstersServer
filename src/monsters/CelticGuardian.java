package monsters;

import exceptions.MonsterDestroyed;
import core.Monster;
import core.Tribe;

public class CelticGuardian extends Monster {

    private final String name = "Celtic Guardian";
    private int atkCrest;
    private int defCrest;
    private final String lore = "This monster adds an additional 10 Attack Power points" +
            "to itself for every Attack Crests spent" +
            "(you can only use this effect once per turn).\n" +
            "This monster adds an additional 10 Defense Power points" +
            "to itself for every Defense Crests spent" +
            "(you can only use this effect once per turn).";

    public CelticGuardian() {
        super(1,Tribe.WARRIOR,20,20,10,false,false);
        this.atkCrest = 0;
        this.defCrest = 0;
    }

    public void damage(int points) throws MonsterDestroyed {
        if(hitPoints - points <= 0) {
            throw new MonsterDestroyed(name);
        }
    }

    public void heal(int points) {
        if(currentHitPoints + points >= hitPoints) {
            currentHitPoints = hitPoints;
        } else {
            currentHitPoints += points;
        }
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public int getDefendPoints() {
        return defendPoints;
    }
}
