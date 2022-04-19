package mymoves.Fearow;

import ru.ifmo.se.pokemon.*;

public class Roost extends SpecialMove {
    public Roost(double pow, double acc){
        super(Type.FLYING,pow,acc);}
    @Override
    protected String describe() {return "uses Roost";}
    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect effect=new Effect();
        effect.stat(Stat.HP,+50);
        p.addEffect(effect);
        System.out.println("restores health");
    }
}
