package monsers;

import Exceptions.MonsterDestroyed;
import core.Monster;
import core.Tribe;

public class BlastLizard extends Monster {

    private final String name = "Blast Lizard";
    private int magCrest;
    private final String lore = "This monster destroys any Level 1 monster or item." +
            "To destroy a monster or item of Level 2 or higher," +
            "add a Magic Crest for every level above Level 1.";


    public BlastLizard(){
        super(2,Tribe.BEAST,10,10,20,false,false);
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
