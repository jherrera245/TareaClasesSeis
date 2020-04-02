package Clases;

/**
 *
 * @author josue
 */
public class CB extends CA {

    //Constructor vacio.
    public CB() {
        z = 0;
    }

    /**
     * Constructor de la clase.
     *
     * @param x numero entero
     * @param y numero entero
     * @param z numero entero
     */
    public CB(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    /**Metodo para sumar.
     * 
     * @return entero, resultado de suma.
     */
    public int suma() {
        return x + y + z;
    }

    //Miembros de clase.
    public int z;

}
