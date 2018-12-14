package Rooms;

import Pokemon.Pokemon;
import People.Person;
import java.util.Scanner;


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

            int battlecounter=1;
            Scanner in= new Scanner(System.in);
            occupant = x;
            fill=y;
            enemy=z;
            x.setxLoc(this.xLoc);
            x.setyLoc(this.yLoc);
            y.setxLoc(this.xLoc);
            y.setyLoc(this.yLoc);
            System.out.println("You have encountered a wild Pokemon! ROOOAAAR!");
            if (battlecounter>0){
                String Start= in.nextLine();
                if (Start == "Attack" || Start =="attack") {
                    battlecounter=battlecounter+1;
            } else{

                }
        }



    }

