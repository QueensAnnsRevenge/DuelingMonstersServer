package monsers;

import Exceptions.MonsterDestroyed;
import core.Monster;
import core.Tribe;

public class CelticGuardian implements Monster {

    private final String name = "Celtic Guardian";
    private int level;
    private Tribe tribe;
    private int attackPoints;
    private int defendPoints;
    private final int hitPoints = 10;
    private int currentHitPoints;
    private boolean flight;
    private boolean tunneling;
    private int atkCrest;
    private int defCrest;
    private final String lore = "This monster adds an additional 10 Attack Power points" +
            "to itself for every Attack Crests spent" +
            "(you can only use this effect once per turn).\n" +
            "This monster adds an additional 10 Defense Power points" +
            "to itself for every Defense Crests spent" +
            "(you can only use this effect once per turn).";

    public CelticGuardian() {
        this.level = 1;
        this.tribe = Tribe.WARRIOR;
        this.attackPoints = 20;
        this.defendPoints = 20;
        this.currentHitPoints = hitPoints;
        this.flight = false;
        this.tunneling = false;
        this.atkCrest = 0;
        this.defCrest = 0;
    }

    @Override
    public void damage(int points) throws MonsterDestroyed {
        if(hitPoints - points <= 0) {
            throw new MonsterDestroyed(name);
        }
    }

    @Override
    public void heal(int points) {
        if(currentHitPoints + points >= hitPoints) {
            currentHitPoints = hitPoints;
        } else {
            currentHitPoints += points;
        }
    }

    @Override
    public int getAttackPoints() {
        return attackPoints;
    }

    @Override
    public int getDefendPoints() {
        return defendPoints;
    }
}
