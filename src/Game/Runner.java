package Game;

import People.Person;
import Rooms.Room;
import Rooms.WinningRoom;
import Rooms.FoundPokemon;
import Board.Board;
import Pokemon.Pokemon;


import java.util.Scanner;

public class  Runner {
	

	private static boolean gameOn = true;
	
	public static void main(String[] args) {
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
        building[x][y] = new WinningRoom(x, y);

        int a = (int) (Math.random() * building.length);
        int b = (int) (Math.random() * building.length);
        building[a][b] = new FoundPokemon(x, y);

        Board Board = new Board(building);

        //Setup player 1 and the input scanner
        Pokemon pokemon1 = new Pokemon("Charmander", 50, "Fire", 0, 0);
        Pokemon pokemon2 = new Pokemon("Squirtle", 60, "Water", 0, 0);
        Pokemon pokemon3 = new Pokemon("Bulbasaur", 50, "Grass", 0, 0);
        Pokemon pokemonAlpha = new Pokemon("Pikachu", 100, "Electric", 0, 0);
        Pokemon Mystery = new Pokemon("ANNOYING CREATURE", (int) (Math.random() * 100) + 50, "Null", 0, 0);
        Scanner in = new Scanner(System.in);
        System.out.println("Which Pokemon will you choose for your journey? \n Charmander, Squirtle,Bulbasaur, or Pikachu");
        String input = in.nextLine();
        Pokemon starterPokemon=null;
        if (input.equals("Charmander")) {
             starterPokemon = pokemon1;
        } else if (input.equals("Squirtle")) {
             starterPokemon = pokemon2;
        } else if (input.equals("Bulbasaur")) {
             starterPokemon = pokemon3;
        } else if(input.equals("Bulbasaur")){
             starterPokemon = pokemonAlpha;
        } else {
            System.out.println("This is not a valid choice.");
        }
		Person player1 = new Person("FirstName", "FamilyName", 0,0);
		building[0][0].enterRoom(player1,starterPokemon,Mystery);
		while(gameOn)
		{
		    Board.print();
			System.out.println("Where would you like to move? (Choose N, S, E, W)");
			String move = in.nextLine();
			if(validMove(move, player1,pokemon1,pokemon2, building))
			{
				System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
				
			}
			else {
				System.out.println("Please choose a valid move.");
			}
			
			
		}
		in.close();
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
