package Item;

import Pokemon.Pokemon;

public class Potion implements Items {
    public void take(Pokemon y){
        y.restoreHealth(10);
    }
    public String getName(){
        return "Potion";
    }
}
