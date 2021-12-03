package exceptions;

public class MonsterDestroyed extends Exception {

    public MonsterDestroyed(String monsterName) {
        super(monsterName + " was destroyed.");
    }

}
