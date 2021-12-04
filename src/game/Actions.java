package game;


import core.Monster;
import exceptions.CannotAttack;
import exceptions.MonsterDestroyed;
import exceptions.SpaceOccupied;
import exceptions.YouAreDead;

public class Actions {
    public void attack(Monster attacker, Monster defender) throws CannotAttack, MonsterDestroyed {

        if(attacker.getAttackPoints() < defender.getDefendPoints()){
            throw new CannotAttack("Cannot attack");
        } else {
            defender.damage(attacker.getAttackPoints() - defender.getDefendPoints());
        }
    }

    public void attack(Player defender, Monster attacker) throws YouAreDead {
        defender.decLifePoints();
        if(defender.getLifePoints() == 0){
            throw new YouAreDead("You died");
        } else {
            defender.decLifePoints();
        }
    }

    public void summon(Monster monster, Space place) throws SpaceOccupied {
        if(place.getAvailableForPlay()){
            place.setMonster(monster);
        } else {
            throw new SpaceOccupied("Ovo mesto je nedostupno");
        }
    }
}
