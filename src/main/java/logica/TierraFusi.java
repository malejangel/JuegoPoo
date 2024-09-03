package logica;

import interfaces.Tierra;
import juego.Pokemones;

public class TierraFusi extends Pokemones implements Tierra {
    /**
     *
     */
    @Override
    public void volverseBolita() {
        System.out.println("Poder Bolita");
    }

    /**
     *
     */
    @Override
    public void lanzarBolitas() {
        System.out.println("Poder lanza Bolita");
    }

    /**
     *
     */
    @Override
    public void rasgunar() {
        System.out.println("Poder rasgunar");
    }

    /**
     *
     */
    @Override
    public void correr() {
        System.out.println("Poder Correr");
    }
}
