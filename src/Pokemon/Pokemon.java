package Pokemon;

public abstract class Pokemon {
    String name;
    int Hp;
    String type;
    int xLoc, yLoc;

    public String getType()
    {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return Hp;
    }

    public int getxLoc() {
        return xLoc;
    }

    public void setxLoc(int xLoc) {
        this.xLoc = xLoc;
    }

    public int getyLoc() {
        return yLoc;
    }

    public void setyLoc(int yLoc) {
        this.yLoc = yLoc;
    }

    public Pokemon(String name,int Hp,String type, int xLoc,int yLoc){
        this.name=name;
        this.Hp=Hp;
        this.type=type;
        this.xLoc = xLoc;
        this.yLoc = yLoc;

    }
}   
