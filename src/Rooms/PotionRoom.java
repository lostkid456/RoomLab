package Rooms;

import Pokemon.Pokemon;
import People.Person;
import Item.Potion;
import Item.Items;


public class PotionRoom extends Room {
    public PotionRoom(int x,int y){
        super(x,y);
    }

    public void enterRoom(Person x, Pokemon y, Pokemon z) {
        occupant = x;
        fill = y;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        y.setxLoc(this.xLoc);
        y.setyLoc(this.yLoc);
        System.out.println("You have found a potion. Your pokemon has restored 10 health");
        y.restoreHealth(10);
    }

    public void leaveRoom(Person x,Pokemon y,Pokemon z) {
        occupant = null;
        fill=null;
        enemy=null;
    }

}
