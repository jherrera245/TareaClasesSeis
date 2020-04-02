package Clases;

import Interfaces.*;

/**
 *
 * @author josue
 */
public class CA implements IA, IB, IC, Comparable<CA> {

    //Constructor vacio.
    public CA() {
        x = 0;
        y = 0;
    }

    /**
     * Constructor de la clase.
     *
     * @param x numero entero
     * @param y numero entero
     */
    public CA(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Metodo para sumar.
     *
     * @return entero, resultado de suma
     */
    public int sumar() {
        return x + y;
    }

    /**
     * Metodo sobre escrito para sumar
     *
     * @return entero, resultado de suma.
     */
    @Override
    public int suma() {
        return x + y;
    }

    /**
     * Metodo sobre escrito para Multiplicar
     *
     * @return entero, resultado de multiplicacion.
     */
    @Override
    public int multiplicar() {
        return x * y;
    }

    /**
     * Metodo sobre escrito para encontrar el numero mayor entre dos numeros.
     *
     * @return entero, resultado de suma.
     */
    @Override
    public int mayor() {
        return Math.max(x, y);
    }

    //Ordenar de menor a mayor con respecto a x
    @Override
    public int compareTo(CA a) {
        if (x == a.x) {
            return 0;
        } else if (x > a.x) {
            return 1;
        } else {
            return -1;
        }
    }

    //Miembros de clase
    public int x;
    public int y;
}
