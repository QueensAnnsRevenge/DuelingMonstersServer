package core;

public abstract class Monster {

    public abstract void attack(Monster monster);

    public abstract void damage(int damage);

    public abstract void heal(int point);

    //public abstract void boostAttack(int points);
}
