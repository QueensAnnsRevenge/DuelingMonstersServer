package game;

import core.Monster;

public class Space {

    private Monster monster;
    private boolean ocupaed = false;
    private boolean availableForPlay = false;
    private Player player;

    public void setMonster(Monster monster) {
        this.monster = monster;
        ocupaed = true;
    }

    public Monster getMonster(){
        return monster;
    }


    public boolean isOcupaed(){ return ocupaed; }

    public void setPlayer(Player p){
        this.player = p;
        ocupaed = true;
    }

    public void setAvailableForPlay(){
        availableForPlay = true;
    }

    public boolean getAvailableForPlay(){
         return availableForPlay;
    }

    public Player getPlayer(){ return player; }
}
