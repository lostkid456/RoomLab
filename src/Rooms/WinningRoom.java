package Rooms;

import Game.Runner;
import People.Person;
import Pokemon.Pokemon;

public class WinningRoom extends Room
{

	public WinningRoom(int x, int y) {
		super(x, y);

	}

	/**
	 * Triggers the game ending conditions.
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
		z.setxLoc(this.xLoc);
		z.setyLoc(this.yLoc);
		System.out.println("You managed to get across.");
		Runner.gameOff();
	}


}