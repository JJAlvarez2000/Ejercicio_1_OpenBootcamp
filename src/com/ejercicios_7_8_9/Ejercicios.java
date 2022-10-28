package com.ejercicios_7_8_9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Ejercicios {

    public static String reverse(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        return reverse;
    }

    public static int dividirPorCero(int numero) throws ArithmeticException {
        try {
            return numero / 0;
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse: no se puede dividir por cero");
            throw e;
        }
        finally {
            System.out.println("Demo de caso: esto se ejecuta siempre");
        }
    }

    public static void main(String[] args) {
        //Ejercicio 1
        String s = "Hola Mundo";
        System.out.println(reverse(s));

        //Ejercicio 2
        String[] stringArray = {"Julio", "Joel", "Alvarez"};
        for (String string : stringArray) {
            System.out.println(string);
        }

        //Ejercicio 3
        int[][] intArray = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int i;
        for (i = 0; i < intArray.length; i++) {
            int j;
            for (j = 0; j < intArray[i].length; j++) {
                System.out.println("el valor de la posicion " + j + " en la columna " + i + " es: " + intArray[i][j]);
            }
        }

        //Ejercicio 3 con Vector
        Vector<Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        vector.remove(1);
        vector.remove(2);

        System.out.println("vector = " + vector);

        //Ejercicio 4
        // El problema de utilizar un vector con la capacidad por defecto es que
        // si se supera la capacidad del vector, este se duplica, por lo que se desperdicia memoria.

        //Ejercicio 5
        ArrayList<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        colores.add("Amarillo");

        LinkedList<String> colores2 = new LinkedList<>(colores);

        System.out.println("colores = " + colores);
        System.out.println("colores2 = " + colores2);

        //Ejercicio 6
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int j = 1; j < 11; j++) {
            numeros.add(j);
        }
        for (int j = 0; j < numeros.size(); j++) {
            boolean esImpar = numeros.get(j) % 2 != 0;
            if (esImpar) numeros.remove(j);
        }
        System.out.println("Numeros = " + numeros);

        dividirPorCero(5);

    }
}
