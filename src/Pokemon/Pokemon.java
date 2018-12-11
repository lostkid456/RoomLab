package Pokemon;

public class Pokemon {
    String name;
    int Hp;
    String type;

    public String getType(){
        return type;
    }

    public String getName(){
        return name;
    }
    public int getHp(){
        return Hp;
    }

    public Pokemon(String name,int Hp,String type){
        this.name=name;
        this.Hp=Hp;
        this.type=type;
    }
}
