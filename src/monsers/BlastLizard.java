package monsers;

import Exceptions.MonsterDestroyed;
import core.Tribe;
import core.Monster;

public class BlastLizard implements Monster {

    private final String name = "Blast Lizard";
    private int level;
    private Tribe tribe;
    private int attackPoints;
    private int defendPoints;
    private final int hitPoints = 10;
    private int currentHitPoints;
    private boolean flight;
    private boolean tunneling;
    private int magCrest;
    private final String lore = "This monster destroys any Level 1 monster or item." +
            "To destroy a monster or item of Level 2 or higher," +
            "add a Magic Crest for every level above Level 1.";


    public BlastLizard(){
        this.level = 2;
        this.attackPoints = 10;
        this.defendPoints = 10;
        this.currentHitPoints = hitPoints;
        this.flight = false;
        this.tunneling = false;
        this.tribe = Tribe.BEAST;
        this.magCrest = 0;
    }


    public void damage(int damage) throws MonsterDestroyed {
        if(hitPoints - damage <= 0) {
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
