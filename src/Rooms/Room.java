package Rooms;

import People.Person;
import Pokemon.Pokemon;

public class Room {
    Pokemon fill;
    Person occupant;
    Pokemon enemy;
    int xLoc, yLoc;

    public Room(int x, int y) {
        xLoc = x;
        yLoc = y;
    }

    /**
     * Method controls the results when a person enters this room.
     *
     * @param x the Person entering
     */
    public void enterRoom(Person x,Pokemon y,Pokemon z) {
        System.out.println("You enter a plain old room");
        occupant = x;
        fill=y;
        enemy=z;
        y.setxLoc(this.xLoc);
        y.setyLoc(this.yLoc);
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    /**
     * Removes the player from the room.
     *
     * @param x
     */
    public void leaveRoom(Person x,Pokemon y,Pokemon z) {
        occupant = null;
        fill=null;
        enemy=null;
    }

    //Overrides the board and shows a P for where the player is and ? for unknown areas
    public String toString() {
        if (occupant!=null && fill!=null) {
            return ("P");
        } else {
            return ("?");
        }
    }
}