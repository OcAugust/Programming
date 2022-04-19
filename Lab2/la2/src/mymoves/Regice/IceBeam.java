package mymoves.Regice;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {
    public IceBeam(double pow, double acc){
        super(Type.ICE,pow,acc);}
    @Override
    protected String describe() {return "uses an Ice Beam";}
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.confuse(p);
        Effect effect =new Effect();
        effect.stat(Stat.ATTACK,2);
        p.addEffect(effect);
        System.out.println("confuses the target");
    }
}
