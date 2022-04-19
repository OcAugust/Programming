package mypoks;

import mymoves.Regice.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Regice extends Pokemon  {//насл-ся от баз класса покемон
    public Regice(String name,int level){//пишем консутрктор где он принимает название и уровень
       super(name,level);//чтобы иници-ть нзвание и уровень обртимся к базовому клссу и он сам их поставит
       setType(Type.ICE);
       setStats(80,50,100,100,200,50);

        Waterfall waterfall= new Waterfall(80,100); //мы создали объект Waterfall, и переменной waterfall присвоена ссылка на этот объект
        IceBeam iceBeam = new IceBeam(90,100);
        DreamEater dreamEater=new DreamEater(100,100);
        WaterGun waterGun=new WaterGun(40,100);

        setMove(waterfall,iceBeam,dreamEater,waterGun);
    }
}
