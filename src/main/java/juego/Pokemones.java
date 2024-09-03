package juego;

public abstract class Pokemones {
    protected  int vida;
    protected String nombre;
    protected String elemento;
     public abstract void rasgunar ();
    public abstract void correr ();

    public Pokemones() {

    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }
}
