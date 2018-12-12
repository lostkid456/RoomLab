package Rooms;

import java.util.Scanner;

import People.Person;
import Pokemon.Pokemon;

public class Battle extends FoundPokemon{

    public Battle(int x, int y){
        super(x,y);
    }

    public void enterRoom(Person x,Pokemon y,Pokemon z) {
            enemy=z;
            occupant = x;
            fill=y;
            x.setxLoc(this.xLoc);
            x.setyLoc(this.yLoc);
            y.setxLoc(this.xLoc);
            y.setyLoc(this.yLoc);
            z.setxLoc(this.xLoc);
            z.setyLoc(this.yLoc);
    }

    public void haveBattle(Pokemon y,Pokemon z){
        Scanner input= new Scanner(System.in);
        System.out.print("Attack or Run?");
        String answer=input.nextLine();
        if(answer=="Attack"||answer=="attack"){
        }
    }
}
