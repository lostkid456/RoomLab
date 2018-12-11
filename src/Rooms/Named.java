package Rooms;

import Pokemon.Pokemon;
import People.Person;

public class Named extends Room{
        public Named(int x, int y) {
            super(x, y);

        }

        /**
         * Triggers the game ending conditions.
         *
         * @param x the Person entering
         */
        @Override
        public void enterRoom(Person x) {

            occupant = x;
            x.setxLoc(this.xLoc);
            x.setyLoc(this.yLoc);
            System.out.println("You have encountered a wild Pokemon! ROOOAAAR!");

        }

    }

