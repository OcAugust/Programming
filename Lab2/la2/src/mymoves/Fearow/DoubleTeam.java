package mymoves.Fearow;


import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(double pow, double acc){
        super(Type.NORMAL,pow,acc);}
    @Override
    protected String describe() {return "uses DoubleTeam";}
    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect effect =new Effect();
        effect.stat(Stat.EVASION,1);
        p.addEffect(effect);
        System.out.println("evasion increased by one stage");
    }
}
