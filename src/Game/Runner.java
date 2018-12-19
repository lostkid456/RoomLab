package Game;

import People.Person;
import Rooms.Room;
import Rooms.WinningRoom;
import Rooms.FoundPokemon;
import Board.Board;
import Pokemon.Pokemon;
import Pokemon.Bulbasaur;
import Pokemon.Pikachu;
import Pokemon.Charmander;
import Pokemon.Squirtle;
import Pokemon.ANNOYINGPOKEMON;


import java.util.Scanner;

public class  Runner {


	private static boolean gameOn = true;

	//Gives user the option to create an easy or hard board and this creates the easy board
	public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("What difficulty do you want to try? Easy or Hard?");
        String inp = c.nextLine();
        if (c.equals("Easy") || c.equals("easy")) {
            Room[][] building = new Room[5][5];

            //Fill the building with normal rooms
            for (int x = 0; x < building.length; x++) {
                for (int y = 0; y < building[x].length; y++) {
                    building[x][y] = new Room(x, y);
                }
            }

            //Create a random winning room.
            int x = (int) (Math.random() * building.length);
            int y = (int) (Math.random() * building.length);
            building[x][y] = new WinningRoom(building.length, building.length);

            int a = (int) (Math.random() * building.length);
            int b = (int) (Math.random() * building.length);
            building[a][b] = new FoundPokemon(x, y);

            Board Board = new Board(building);
            Bulbasaur bulbasaur = new Bulbasaur("Bulbasaur", 100, "Grass", 0, 0);
            Charmander charmander = new Charmander("Charmander", 100, "Fire", 0, 0);
            Squirtle squirtle = new Squirtle("Squirtle", 100, "Water", 0, 0);
            Pikachu pikachu = new Pikachu("Pikachu", 100, "Electric", 0, 0);
            ANNOYINGPOKEMON annoyingpokemon = new ANNOYINGPOKEMON("Annoying Pokemon", (int) (Math.random() * 90 + 25), "null", a, b);
            Scanner in = new Scanner(System.in);
            System.out.println("Which Pokemon will you choose for your journey? \n Charmander, Squirtle,Bulbasaur, or Pikachu");
            String input = in.nextLine();
            Pokemon starterPokemon = null;
            if (input.equals("Charmander") || input.equals("charmander")) {
                starterPokemon = charmander;
            } else if (input.equals("Squirtle") || input.equals("squirtle")) {
                starterPokemon = squirtle;
            } else if (input.equals("Bulbasaur") || input.equals("bulbasaur")) {
                starterPokemon = bulbasaur;
            } else if (input.equals("Pikachu") || input.equals("pikachu")) {
                starterPokemon = pikachu;
            } else {
                System.out.println("This is not a valid choice.");
            }
            Person player1 = new Person("FirstName", "FamilyName", 0, 0);
            building[0][0].enterRoom(player1, starterPokemon, annoyingpokemon);
            while (gameOn) {
                Board.print();
                System.out.println("Where would you like to move? (Choose N, S, E, W)");
                String move = in.nextLine();
                if (validMove(move, player1, starterPokemon, annoyingpokemon, building)) {
                    System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());

                } else {
                    System.out.println("Please choose a valid move.");
                }


            }
            in.close();
            // This creates the hard board
        } else {
            Board board1 = new Board(10, 10);
            Room[][] hardboard = new Room[10][10];
            for (int i = 0; i < hardboard.length; i++) {
                for (int j = 0; j < hardboard[i].length; j++) {
                    hardboard[i][j] = new Room(i, j);
                }
            }
            Bulbasaur bulbasaur = new Bulbasaur("Bulbasaur", 100, "Grass", 0, 0);
            Charmander charmander = new Charmander("Charmander", 100, "Fire", 0, 0);
            Squirtle squirtle = new Squirtle("Squirtle", 100, "Water", 0, 0);
            Pikachu pikachu = new Pikachu("Pikachu", 100, "Electric", 0, 0);
            ANNOYINGPOKEMON annoyingpokemon = new ANNOYINGPOKEMON("Annoying Pokemon", (int) (Math.random() * 90 + 25), "null", 10, 10);
            Scanner in = new Scanner(System.in);
            System.out.println("Which Pokemon will you choose for your journey? \n Charmander, Squirtle,Bulbasaur, or Pikachu");
            String input = in.nextLine();
            Pokemon starterPokemon = null;
            if (input.equals("Charmander") || input.equals("charmander")) {
                starterPokemon = charmander;
            } else if (input.equals("Squirtle") || input.equals("squirtle")) {
                starterPokemon = squirtle;
            } else if (input.equals("Bulbasaur") || input.equals("bulbasaur")) {
                starterPokemon = bulbasaur;
            } else if (input.equals("Pikachu") || input.equals("pikachu")) {
                starterPokemon = pikachu;
            } else {
                System.out.println("This is not a valid choice.");
            }
            Person player1 = new Person("FirstName", "FamilyName", 0, 0);
            hardboard[0][0].enterRoom(player1, starterPokemon, annoyingpokemon);
            while (gameOn) {
                board1.print();
                System.out.println("Where would you like to move? (Choose N, S, E, W)");
                String move = in.nextLine();
                if (validMove(move, player1, starterPokemon, annoyingpokemon, hardboard)) {
                    System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());

                } else {
                    System.out.println("Please choose a valid move.");
                }


            }
            in.close();
        }
	}





	/**
	 * Checks that the movement chosen is within the valid game map.
	 * @param move the move chosen
	 * @param p person moving
	 * @param map the 2D array of rooms
	 * @return
	 */
	public static boolean validMove(String move, Person p,Pokemon b,Pokemon z, Room[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "n":
				if (p.getxLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p,b,z);
					map[p.getxLoc()-1][p.getyLoc()].enterRoom(p,b,z);
					return true;
				}
				else
				{
					return false;
				}
			case "e":
				if (p.getyLoc()< map[p.getyLoc()].length -1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p,b,z);
					map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p,b,z);
					return true;
				}
				else
				{
					return false;
				}

			case "s":
				if (p.getxLoc() < map.length - 1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p,b,z);
					map[p.getxLoc()+1][p.getyLoc()].enterRoom(p,b,z);
					return true;
				}
				else
				{
					return false;
				}

			case "w":
				if (p.getyLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p,b,z);
					map[p.getxLoc()][p.getyLoc()-1].enterRoom(p,b,z);
					return true;
				}
				else
				{
					return false;
				}
			default:
				break;

		}
		return true;
	}
	public static void gameOff()
	{
		gameOn = false;
	}



}