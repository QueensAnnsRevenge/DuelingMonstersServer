package core;

import Exceptions.MonsterDestroyed;

public interface Monster {
     void damage(int points) throws MonsterDestroyed;
     void heal(int points);
     int getAttackPoints();
     int getDefendPoints();

}
