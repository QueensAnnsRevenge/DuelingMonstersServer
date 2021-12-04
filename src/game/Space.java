package game;

import core.Item;
import core.Monster;

public class Space {

    private Monster monster;
    //Shows if there is a monster on the space
    private boolean occupied = false;
    //Shows if this space is available for the monster to move there
    private boolean availableForPlay = true;
    private Player player;
    private boolean hasItem;
    private Item item;

    public void setMonster(Monster monster) {
        this.monster = monster;
        occupied = true;
    }


    public void setPlayer(Player p){
        this.player = p;
        occupied = true;
    }

    public void setItem(Item item){
        this.item = item;
        this.occupied = true;
        this.hasItem = true;
    }

    public Player getPlayer(){ return player; }

    public Monster getMonster(){
        return monster;
    }

    public Item getItem(){ return item; }

    public boolean getHasItem(){ return hasItem; }

    public boolean isOcupaed(){ return occupied; }

    public boolean getAvailableForPlay(){
         return availableForPlay;
    }
}
