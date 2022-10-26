package com.ejercicios_7_8_9;

import java.lang.reflect.Array;

public class Ejercicios {

    public static String reverse(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        return reverse;
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
    }
}
