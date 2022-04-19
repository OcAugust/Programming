package mymoves.Fearow;
import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide(double pow, double acc){
        super(Type.NORMAL,pow,acc);}
    @Override
    protected String describe() {return "uses Confide";}
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect effect =new Effect();
        effect.stat(Stat.SPECIAL_ATTACK,-1);
        p.addEffect(effect);
        System.out.println("lowers the target's Special Attack by one stage");
    }
}