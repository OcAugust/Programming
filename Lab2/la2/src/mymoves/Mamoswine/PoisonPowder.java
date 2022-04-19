package mymoves.Mamoswine;

import ru.ifmo.se.pokemon.*;

public class PoisonPowder extends StatusMove {
    public PoisonPowder(double pow, double acc) {
        super(Type.POISON, pow, acc);
    }

    @Override
    protected String describe() {
        return "uses PoisonPowder";
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
            Effect.poison(p);
            System.out.println("the opponent is poisoned");

    }
}
