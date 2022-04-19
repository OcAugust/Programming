package mymoves.Regice;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Waterfall extends PhysicalMove { //Category
    public  Waterfall(double pow,double acc){
        super(Type.WATER,pow,acc);}
    @Override
    protected String describe() {return "uses a water attack";}
    @Override
    protected void applyOppEffects(Pokemon p) { //Move
        if (Math.random() * 100 <= 20) {
            Effect.flinch(p);
            System.out.println("the opponent wavered");
        }
    }

}
