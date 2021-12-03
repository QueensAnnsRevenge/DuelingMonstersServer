package game;

import core.Monster;

public class Space {

    private Monster monster;
    //Shows if there is a monster on the space
    private boolean occupied = false;
    //Shows if this space is available for the monster to move there
    private boolean availableForPlay = false;
    private Player player;

    public void setMonster(Monster monster) {
        this.monster = monster;
        occupied = true;
    }

    public Monster getMonster(){
        return monster;
    }


    public boolean isOcupaed(){ return occupied; }

    public void setPlayer(Player p){
        this.player = p;
        occupied = true;
    }

    public void setAvailableForPlay(){
        availableForPlay = true;
    }

    public boolean getAvailableForPlay(){
         return availableForPlay;
    }

    public Player getPlayer(){ return player; }
}
