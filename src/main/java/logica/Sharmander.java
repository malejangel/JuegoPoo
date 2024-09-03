package logica;

import interfaces.Fuego;
import interfaces.Tierra;
import juego.Pokemones;

public class Sharmander extends Pokemones implements Fuego {
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

        System.out.println("Poder correr");
    }

    /**
     *
     */
    @Override
    public void quemadura() {
        System.out.println("Poder quemadura");
    }

    /**
     *
     */
    @Override
    public void lanzaFuego() {
        System.out.println("Poder lanzaFuego");

    }

}
