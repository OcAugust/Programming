package mypoks;

import mymoves.Fearow.DoubleTeam;
import mymoves.Mamoswine.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Swinub extends Pokemon {
    public Swinub(String name,int level){
        super(name,level);
        setType(Type.ICE,Type.GROUND);
        setStats(50,50,40,30,30,50);

        DoubleTeam doubleTeam=new DoubleTeam(0,0);
        Swagger swagger=new Swagger(0,85);

        setMove(doubleTeam,swagger);
    }
}
