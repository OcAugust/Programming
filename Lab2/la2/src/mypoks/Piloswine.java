package mypoks;

import mymoves.Mamoswine.Screech;
import ru.ifmo.se.pokemon.Type;

public class Piloswine extends Swinub{
    public Piloswine(String name,int level){
        super(name,level);
        setType(Type.ICE,Type.GROUND);
        setStats(100,100,80,60,60,50);

        Screech screech=new Screech(0,85);
        setMove(screech);
    }
}
