/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Abstracts.CC;

/**
 *
 * @author josue
 */
public class CD extends CC {

    /**
     * Constructor de la clase.
     *
     * @param x numero entero.
     * @param y numero entero.
     */
    public CD(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Metodo sobre escrito para sumar.
     *
     * @return entero, resultado de suma.
     */
    @Override
    public int suma() {
        return x + y;
    }

    /**
     * Metodo sobre escrito para sumar.
     *
     * @return entero, resultado de suma.
     */
    @Override
    public int dobleSuma() {
        return  x + y;
    }

    //Miembros de Clase
    public int x;
    public int y;
}
