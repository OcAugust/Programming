package mymoves.Mamoswine;

import ru.ifmo.se.pokemon.*;

public class Swagger extends SpecialMove {
    public Swagger(double pow, double acc){
        super(Type.NORMAL,pow,acc);}
    @Override
    protected String describe() {return "uses Swagger";}
    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect effect =new Effect();
        effect.stat(Stat.EVASION,1);
        p.addEffect(effect);
        System.out.println("evasion increased by one stage");
    }
}
