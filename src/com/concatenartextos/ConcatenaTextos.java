package com.concatenartextos;

public class ConcatenaTextos {
    public static void main(String[] args) {
        String[] nombres = {"Openbootcamp", "Java", "Developer", "Software"};
        concatenar(nombres);
    }

    private static void concatenar(String[] nombres) {
        String texto = "";
        for(String nombre : nombres) {
            texto += nombre + " ";
        }
        System.out.println("texto = " + texto);
    }
}
