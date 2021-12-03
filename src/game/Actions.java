package game;

import Exceptions.CanNotAttac;
import Exceptions.MonsterDestroyed;
import Exceptions.YouAreDead;
import core.Monster;

public class Actions {
    public void attac(Monster attacker, Monster defender) throws CanNotAttac, MonsterDestroyed {

        if(attacker.getAttackPoints() < defender.getDefendPoints()){
            throw new CanNotAttac("Cannot attack");
        } else {
            defender.damage(attacker.getAttackPoints());
        }
    }

    public void attackPlayer(Player defender, Monster attacker) throws YouAreDead {
        if(defender.getLifePoints() - 1 == 0){
            throw new YouAreDead("Yout died");
        } else {
            defender.decLifePoints();
        }
    }
}
