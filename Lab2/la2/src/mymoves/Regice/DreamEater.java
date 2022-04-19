package mymoves.Regice;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    public DreamEater(double pow, double acc){
        super(Type.PSYCHIC,pow,acc);}
    @Override
    protected String describe() {return "uses DreamEater";}
    protected void applySelfEffects(Pokemon p) {
        Effect effect=new Effect();
        effect.stat(Stat.HP,+50);
        p.addEffect(effect);
        System.out.println("restores health");
    }
}
