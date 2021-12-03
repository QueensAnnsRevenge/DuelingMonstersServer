package game;

import core.Monster;
import exceptions.CannotAttack;
import exceptions.MonsterDestroyed;
import exceptions.YouAreDead;

public class Actions {
    public void attack(Monster attacker, Monster defender) throws CannotAttack, MonsterDestroyed {

        if(attacker.getAttackPoints() < defender.getDefendPoints()){
            throw new CannotAttack("Cannot attack");
        } else {
            defender.damage(attacker.getAttackPoints());
        }
    }

    public void attackPlayer(Player defender, Monster attacker) throws YouAreDead {
        if(defender.getLifePoints() - 1 == 0){
            throw new YouAreDead("You died");
        } else {
            defender.decLifePoints();
        }
    }
}
