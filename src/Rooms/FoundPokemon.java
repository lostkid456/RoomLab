package Rooms;

import Pokemon.Pokemon;
import People.Person;
import java.util.Scanner;


public class FoundPokemon extends Room {

    public FoundPokemon(int x, int y) {
        super(x, y);
    }

    /**
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x, Pokemon y, Pokemon z) {
        occupant = x;
        fill = y;
        enemy = z;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        y.setxLoc(this.xLoc);
        y.setyLoc(this.yLoc);
        System.out.println("You have encountered a wild Pokemon! ROOOAAAR!");
        String health = "\nHEALTH:   ";
        String healthbar = "";
        int healthbarlength = 0;
        for (int i = 0; i < enemy.getHp(); i++) {
            healthbar += "=";
            healthbarlength++;
        }
        int damage;
        int dealt = 0;
        System.out.println(health + healthbar);
        while (dealt < healthbarlength) {
            Scanner in = new Scanner(System.in);
            System.out.print("What attack do you want to do? \n Normal attack or Special attack.\n You only have one charge for your special attack so be wary");
            String input = in.nextLine();
            if (input.equals("Normal") || input.equals("normal")) {
                damage = 30;
                dealt += damage;
            } else if (input.equals("Special") || input.equals("special")) {
                damage = 10000;
                dealt += damage;
            }
            if (healthbar.length() - damage > 0) {
                healthbar = healthbar.substring(0, healthbar.length() - damage);
                System.out.println(enemy);
            }
            System.out.println(health + healthbar);
            System.out.println("You did " + damage + " damage!");
            enemy.attack(x);
            if (fill.getHp() < 0) {
                break;
            }
            if(fill.getHp() < 0){
                System.out.println("GAME OVER.");

            }
            else {
                System.out.println("========================");
                System.out.println("\nYOU BEAT THE MONSTER!\n");
        }
    }
    }
}

