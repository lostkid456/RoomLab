package Pokemon;

public class Squirtle extends Pokemon {
    public Squirtle(String name,int Hp,String type,int xLoc,int yLoc){
        super(name,Hp,type,xLoc,yLoc);
    }
    public void attack(Pokemon z){
        int dealt=30;
        z.Hp-=dealt;
    }
}