package game;


import core.Dice;
import core.Monster;
import core.Side;
import dice.*;
import exceptions.CannotAttack;
import exceptions.MonsterDestroyed;
import exceptions.SpaceOccupied;
import exceptions.YouAreDead;

import java.util.Random;

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

    public Side[] rollDice(int diceLevel) {
        Side[] returnSides = new Side[3];
        Dice firstDie, secondDie, thirdDie;
        switch (diceLevel) {
            case 1:
                firstDie = new Dicelvl1v1();
                secondDie = new Dicelvl1v2();
                thirdDie = new Dicelvl1v3();
                returnSides[0] = firstDie.throwDice();
                returnSides[1] = secondDie.throwDice();
                returnSides[2] = thirdDie.throwDice();
                break;
            case 2:
                firstDie = new Dicelvl2v1();
                secondDie = new Dicelvl2v2();
                thirdDie = new Dicelvl2v3();
                returnSides[0] = firstDie.throwDice();
                returnSides[1] = secondDie.throwDice();
                returnSides[2] = thirdDie.throwDice();
            case 3:
                firstDie = new Dicelvl3v1();
                secondDie = new Dicelvl3v2();
                thirdDie = new Dicelvl3v3();
                returnSides[0] = firstDie.throwDice();
                returnSides[1] = secondDie.throwDice();
                returnSides[2] = thirdDie.throwDice();
            case 4:
                firstDie = new Dicelvl4v1();
                secondDie = new Dicelvl4v1();
                thirdDie = new Dicelvl4v1();
                returnSides[0] = firstDie.throwDice();
                returnSides[1] = secondDie.throwDice();
                returnSides[2] = thirdDie.throwDice();
                break;
        }
        return returnSides;

    public void summon(Monster monster, Space place) throws SpaceOccupied {
        if(place.getAvailableForPlay()){
            place.setMonster(monster);
        } else {
            throw new SpaceOccupied("Ovo mesto je nedostupno");
        }
    }
}
