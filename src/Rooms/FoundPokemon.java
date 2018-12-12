package Rooms;

import Pokemon.Pokemon;
import People.Person;


public class FoundPokemon extends Room{

        public FoundPokemon(int x, int y) {
            super(x, y);
        }

        /**
         *
         *
         * @param x the Person entering
         */
        @Override
        public void enterRoom(Person x,Pokemon y,Pokemon z) {

            occupant = x;
            fill=y;
            enemy=z;
            x.setxLoc(this.xLoc);
            x.setyLoc(this.yLoc);
            y.setxLoc(this.xLoc);
            y.setyLoc(this.yLoc);
            System.out.println("You have encountered a wild Pokemon! ROOOAAAR!");
        }

    }

