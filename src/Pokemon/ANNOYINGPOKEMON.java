package Pokemon;

public class ANNOYINGPOKEMON extends Pokemon{
    public ANNOYINGPOKEMON(String name,int Hp,String type,int xLoc,int yLoc){
        super(name,Hp,type,xLoc,yLoc);
    }
    public void attack(Pokemon y){
        int dealt=30;
        y.Hp-=dealt;
    }
}

