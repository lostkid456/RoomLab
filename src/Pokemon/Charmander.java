package Pokemon;

public class Charmander extends Pokemon {
    public Charmander(String name,int Hp,String type,int xLoc,int yLoc){
        super(name,Hp,type,xLoc,yLoc);
    }
    public void attack(Pokemon z){
        int dealt=30;
        z.Hp-=dealt;
    }
}