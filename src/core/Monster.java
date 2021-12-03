package core;

import exceptions.MonsterDestroyed;

public abstract class Monster {
    protected int level;
    protected Tribe tribe;
    protected int attackPoints;
    protected int defendPoints;
    protected int hitPoints;
    protected int currentHitPoints;
    protected boolean flight;
    protected boolean tunneling;

    protected Monster(int level, Tribe tribe, int attackPoints, int defendPoints, int hitPoints, boolean flight, boolean tunneling){
        this.level = level;
        this.tribe = tribe;
        this.attackPoints = attackPoints;
        this.defendPoints = defendPoints;
        this.hitPoints = hitPoints;
        this.currentHitPoints = hitPoints;
        this.flight = false;
        this.tunneling = tunneling;
    }

    public abstract int getAttackPoints();

    public abstract int getDefendPoints();

    public abstract void damage(int damage) throws MonsterDestroyed;

    public abstract void heal(int points);
}
