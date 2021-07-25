package game;

import Exceptions.NumberOfCreastsOutOfBounds;
import Exceptions.YouAreDead;
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

    public Player(){
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

    public void addAtkCrest(int number) throws NumberOfCreastsOutOfBounds{
        if (atkCrest <= 10) {
            atkCrest += number;
        } else {
            throw new NumberOfCreastsOutOfBounds("Too many Attack creasts");
        }
    }

    public void addDefCreast(int number) throws NumberOfCreastsOutOfBounds{
        if (defCrest <= 10) {
            this.defCrest += number;
        } else {
            throw new NumberOfCreastsOutOfBounds("Too many Defend creasts");
        }
    }

    public void addMovCrest(int number) throws NumberOfCreastsOutOfBounds{
        if (movCrest <= 10) {
            movCrest += number;
        } else {
            throw new NumberOfCreastsOutOfBounds("Too many Moovment creasts");
        }
    }

    public void addMagVrest(int number) throws NumberOfCreastsOutOfBounds{
        if (magCrest <= 10) {
            magCrest += number;
        } else {
            throw new NumberOfCreastsOutOfBounds("Too many Magic creasts");
        }
    }

    public void addTrpCreasts(int number) throws NumberOfCreastsOutOfBounds{
        if (trpCrest <= 10){
            trpCrest += number;
        } else {
            throw new NumberOfCreastsOutOfBounds("Too many Trap creasts");
        }
    }

    public void cecAtkCrest(int number) throws NumberOfCreastsOutOfBounds{
        if (atkCrest - number >= 0) {
            atkCrest -= number;
        } else {
            throw new NumberOfCreastsOutOfBounds("Not enough Attack creasts");
        }
    }

    public void decDefCreast(int number) throws NumberOfCreastsOutOfBounds{
        if (defCrest - number >= 0) {
            this.defCrest -= number;
        } else {
            throw new NumberOfCreastsOutOfBounds("Not enough Defend creasts");
        }
    }

    public void decMovCrest(int number) throws NumberOfCreastsOutOfBounds{
        if (movCrest - number >= 0) {
            movCrest -= number;
        } else {
            throw new NumberOfCreastsOutOfBounds("Not enough Moovment creasts");
        }
    }

    public void decMagVrest(int number) throws NumberOfCreastsOutOfBounds{
        if (magCrest - number >= 0) {
            magCrest -= number;
        } else {
            throw new NumberOfCreastsOutOfBounds("Not enough Magic creasts");
        }
    }

    public void decTrpCreasts(int number) throws NumberOfCreastsOutOfBounds{
        if (trpCrest - number >= 0){
            trpCrest -= number;
        } else {
            throw new NumberOfCreastsOutOfBounds("Not enough Trap creasts");
        }
    }

}
