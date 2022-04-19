import mypoks.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

import java.awt.print.Printable;

public class Proga {
    //https://pokemondb.net/pokedex/regice
    //https://pokemondb.net/pokedex/spearow
    //https://pokemondb.net/pokedex/fearow
    //https://pokemondb.net/pokedex/swinub
    //https://pokemondb.net/pokedex/piloswine
    //https://pokemondb.net/pokedex/mamoswine
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon p1 = new Pokemon("Чужой", 1);

        Regice regice = new Regice("Iceberg", 1);
        Spearow spearow = new Spearow("Bird",1);
        Fearow fearow=new Fearow("Beak" ,1);
        Swinub swinub=new Swinub("Pig ",1);
        Mamoswine mamoswine=new Mamoswine("TwinTusk",1);
        Piloswine piloswine=new Piloswine("Swine ",1);

        b.addAlly(swinub);
        b.addAlly(mamoswine);
        b.addAlly(piloswine);

        b.addFoe(regice);
        b.addFoe(spearow);
        b.addFoe(fearow);

        b.go();

    }
}
