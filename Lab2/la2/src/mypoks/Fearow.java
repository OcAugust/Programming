package mypoks;

import mymoves.Fearow.Roost;
import ru.ifmo.se.pokemon.Type;

public class Fearow extends Spearow {
    public Fearow(String name,int level){
        super(name,level);
        setType(Type.NORMAL,Type.FLYING);
        setStats(65,90,65,61,61,100);

        Roost roost=new Roost(0,0);
        setMove(roost);
    }
}
