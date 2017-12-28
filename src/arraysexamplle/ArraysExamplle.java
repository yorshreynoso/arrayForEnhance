/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysexamplle;

import java.util.Scanner;

/**
 *
 * @author YORSH
 */
public class ArraysExamplle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final int VALUE = 3;

        String[] nombre = new String[VALUE];
        int[] edad = new int[VALUE];

        Scanner teclado = new Scanner(System.in);
        for (int data = 0; data < VALUE; data++) {
            System.out.println("dame un nombre");
            nombre[data] = teclado.nextLine();

            System.out.println("cuantos años tienes?");
            edad[data] = teclado.nextInt();
            //como no sale del buffer a teclado el cambio de linea, se tiene que burlar el sistema con lo siguiente
            teclado.nextLine(); // truco para poder leer correctamente
        }

        System.out.println("La lista es..");

        for (int data = 0; data < VALUE; data++) {
            System.out.println("nombre: " + nombre[data] + " edad: " + edad[data]);

        }

        //con un for mejorado, NOTA: NO SE PUEDEN CREAR DOS ITERACIONES A LA PAR
        for (String nombres : nombre) {
            System.out.println("nombre:... " + nombres);
        }

    }

}
