package juego;

import interfaces.Tierra;
import logica.German;
import logica.Sharmander;
import logica.TierraFusi;

public class JuegoPrueba {
    public static void main(String[] args) {

        TierraFusi tierraFusi = new TierraFusi ();
        Sharmander sharmander = new Sharmander();
        German german = new German();


        tierraFusi.nombre="Lesly";
        tierraFusi.vida=10;
        tierraFusi.elemento="Tierra";
        tierraFusi.correr();
        tierraFusi.lanzarBolitas();
        tierraFusi.volverseBolita();

        System.out.println("german  = " +tierraFusi.nombre);

        sharmander.nombre="Juanita";
        sharmander.vida=10;
        sharmander.elemento="fuego";
        sharmander.correr();
        sharmander.lanzaFuego();
        sharmander.quemadura();
        System.out.println("german  = " +sharmander.nombre);

        german.nombre="Andres";
        german.vida=10;
        german.elemento="Fantasma";
        german.correr();
        german.desaparecer();
        german.poseer();

        System.out.println("german  = " +german.nombre) ;
    }
}
