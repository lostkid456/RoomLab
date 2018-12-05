package Pokemon;

public class Pokemon {
    String name;
    int Hp;

    public String getName(){
        return name;
    }
    public int getHp(){
        return Hp;
    }

    public Pokemon(String name,int Hp){
        this.name=name;
        this.Hp=Hp;
    }
}
