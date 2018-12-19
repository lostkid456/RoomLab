package Pokemon;


public class Bulbasaur extends Pokemon {
    public Bulbasaur(String name, int Hp, String type, int xLoc, int yLoc) {
        super(name, Hp, type, xLoc, yLoc);
    }

    public void attack(Pokemon z) {
        int dealt = 30;
        z.Hp -= dealt;
    }
}

