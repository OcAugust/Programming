package mymoves.Regice;
import ru.ifmo.se.pokemon.*;

public class WaterGun extends SpecialMove {
    public WaterGun(double pow, double acc){
        super(Type.WATER,pow,acc);}
    @Override
    protected String describe() {return "uses WaterGun the opponent takes  damage ";}
}
