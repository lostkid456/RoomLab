package Rooms;

import Game.Runner;
import People.Person;

public class Named extends Room{

    public Named(int x,int y){
        super(x,y);
    }

    @Override
    public void enterRoom(Person x){
        occupant=x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You have found the ghost!");
        Runner.gameOff();
    }
}
