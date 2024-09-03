package logica;

import interfaces.Fantasma;
import juego.Pokemones;

public class German extends Pokemones implements Fantasma {
    /**
     *
     */
    @Override
    public void rasgunar() {
        System.out.println("Poder rasguno");
    }

    /**
     *
     */
    @Override
    public void correr() {
        System.out.println("Poder Corrrer");
    }

    /**
     *
     */
    @Override
    public void desaparecer() {
        System.out.println("Poder desparecer");
    }

    /**
     *
     */
    @Override
    public void poseer() {
        System.out.println("Pder poseer");
    }
}
