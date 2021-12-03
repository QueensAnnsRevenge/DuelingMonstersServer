package game;

import exceptions.MonsterLimit;
import exceptions.NumberOfCrestsOutOfBounds;
import exceptions.YouAreDead;
import core.Monster;

import java.util.List;

public class Player {

    private String name;
    private int lifePoints;
    private int atkCrest;
    private int defCrest;
    private int movCrest;
    private int magCrest;
    private int trpCrest;
    private List<Monster> monsters;
    private int numberOfSummonedMonsters;

    public Player(){
        this.numberOfSummonedMonsters = 0;
        this.lifePoints = 3;
        this.atkCrest = 0;
        this.defCrest = 0;
        this.movCrest = 0;
        this.magCrest = 0;
        this.trpCrest = 0;
    }

    public void setName (String nameS) throws NullPointerException{
        if (nameS != null) {
            name = nameS;
        } else {
            throw new NullPointerException();
        }
    }

    public void decLifePoints() throws YouAreDead{
        if (lifePoints >= 1){
            lifePoints--;
        } else {
            throw new YouAreDead("You are Dead");
        }
    }

    public void addAtkCrests(int number) throws NumberOfCrestsOutOfBounds {
        if (atkCrest < 10) {
            atkCrest += number;
        } else {
            throw new NumberOfCrestsOutOfBounds("Too many Attack crests.");
        }
    }

    public void addDefCrests(int number) throws NumberOfCrestsOutOfBounds {
        if (defCrest < 10) {
            this.defCrest += number;
        } else {
            throw new NumberOfCrestsOutOfBounds("Too many Defend crests.");
        }
    }

    public void addMovCrests(int number) throws NumberOfCrestsOutOfBounds {
        if (movCrest < 10) {
            movCrest += number;
        } else {
            throw new NumberOfCrestsOutOfBounds("Too many Movement crests.");
        }
    }

    public void addMagCrests(int number) throws NumberOfCrestsOutOfBounds {
        if (magCrest < 10) {
            magCrest += number;
        } else {
            throw new NumberOfCrestsOutOfBounds("Too many Magic crests.");
        }
    }

    public void addTrpCrests(int number) throws NumberOfCrestsOutOfBounds {
        if (trpCrest < 10){
            trpCrest += number;
        } else {
            throw new NumberOfCrestsOutOfBounds("Too many Trap crests.");
        }
    }

    public void decAtkCrests(int number) throws NumberOfCrestsOutOfBounds {
        if (atkCrest - number > 0) {
            atkCrest -= number;
        } else {
            throw new NumberOfCrestsOutOfBounds("Not enough Attack crests.");
        }
    }

    public void decDefCrests(int number) throws NumberOfCrestsOutOfBounds {
        if (defCrest - number > 0) {
            this.defCrest -= number;
        } else {
            throw new NumberOfCrestsOutOfBounds("Not enough Defend crests.");
        }
    }

    public void decMovCrests(int number) throws NumberOfCrestsOutOfBounds {
        if (movCrest - number > 0) {
            movCrest -= number;
        } else {
            throw new NumberOfCrestsOutOfBounds("Not enough Movement crests.");
        }
    }

    public void decMagCrests(int number) throws NumberOfCrestsOutOfBounds {
        if (magCrest - number >= 0) {
            magCrest -= number;
        } else {
            throw new NumberOfCrestsOutOfBounds("Not enough Magic crests.");
        }
    }

    public void decTrpCrests(int number) throws NumberOfCrestsOutOfBounds {
        if (trpCrest - number > 0){
            trpCrest -= number;
        } else {
            throw new NumberOfCrestsOutOfBounds("Not enough Trap crests.");
        }
    }

    public void summonMonster(Space spaceForSummoning, Monster monster) throws MonsterLimit{
        if (numberOfSummonedMonsters < 10){
            numberOfSummonedMonsters++;
            spaceForSummoning.setMonster(monster);
        } else {
            throw new MonsterLimit("You can't have more than 10 monsters");
        }
    }

}
