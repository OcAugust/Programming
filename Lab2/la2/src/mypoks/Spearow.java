package mypoks;

import mymoves.Fearow.Confide;
import mymoves.Fearow.DoubleTeam;
import mymoves.Fearow.Tackle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Spearow extends Pokemon {
    public Spearow(String name,int level){
        super(name,level);
        setType(Type.NORMAL,Type.FLYING);
        setStats(40,60,30,31,31,70);

        DoubleTeam doubleTeam=new DoubleTeam(0,0);
        Confide confide=new Confide(0,0);
        Tackle tackle=new Tackle(40,100);

        setMove(doubleTeam,confide,tackle);
    }
}

