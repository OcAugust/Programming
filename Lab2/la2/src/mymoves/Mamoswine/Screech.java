package mymoves.Mamoswine;

import ru.ifmo.se.pokemon.*;

public class  Screech extends StatusMove {
    public Screech(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected String describe() {
        return "uses a Screech";
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect effect=new Effect();
        effect.stat(Stat.DEFENSE,-2);
        p.addEffect(effect);
        System.out.println("reduces target protection by two stages");
    }
}