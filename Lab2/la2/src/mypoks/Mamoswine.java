package mypoks;

import mymoves.Mamoswine.PoisonPowder;
import ru.ifmo.se.pokemon.Type;

public class Mamoswine extends Piloswine{
    public Mamoswine(String name,int level){
        super(name,level);
        setType(Type.ICE,Type.GROUND);
        setStats(110,130,80,70,60,80);

        PoisonPowder poisonPowder=new PoisonPowder(0,75);

        setMove(poisonPowder);
    }
}
