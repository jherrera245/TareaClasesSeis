package Main;

import Clases.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author josue
 */
public class Implementacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciando Objetos
        CA a = new CB(1, 2, 3); //Ejercicio uno
        CD cd = new CD(10, 4); //Ejercicio dos
        CA ca = new CA(2, 3); //Ejercicio tres

        //Arreglo de objetos
        ArrayList<CA> listaCA = new ArrayList<>();
        //Agregando valores.
        listaCA.add(new CA(5, 2));
        listaCA.add(new CA(2, 1));
        listaCA.add(new CA(8, 7));
        listaCA.add(new CA(4, 9));
        listaCA.add(new CA(10, 2));

        //Ordenar valores
        Collections.sort(listaCA);

        System.out.println("-> El valor de sumar es: " + a.sumar());
        System.out.println("-> El valor de sumar es: " + cd.suma());
        System.out.println("-> El valor de sumarDoble es: " + cd.dobleSuma());

        System.out.println("\n-> El valor de sumar es: " + ca.sumar());
        System.out.println("-> El valor de multiplicar es: " + ca.multiplicar());
        System.out.println("-> El valor de mayor es: " + ca.mayor());

        System.out.println("\n-> El valor de la lista ordenada de menor-mayor con respecto a x es: ");
        for (CA valores : listaCA) {
            System.out.println("x: " + valores.x + "\t" + " y: " + valores.y);
        }
    }
}
