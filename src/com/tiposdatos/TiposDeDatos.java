package com.tiposdatos;

public class TiposDeDatos {
    public static void main(String[] args) {
        // Tipos de datos primitivos
        // Tipos de datos enteros

        byte byteVar = 127;
        System.out.println("Valor de byteVar: " + byteVar);
        short shortVar = 32767;
        System.out.println("shortVar = " + shortVar);

        int intVar = 2147483647;
        System.out.println("intVar = " + intVar);
        long longVar = 9223372036854775807L;
        System.out.println("longVar = " + longVar);

        // Tipos de datos de punto flotante
        float floatVar = 3.4028235E38F;
        System.out.println("floatVar = " + floatVar);
        double doubleVar = 1.7976931348623157E308;
        System.out.println("doubleVar = " + doubleVar);

        // Tipos de datos de caracteres
        char charVar = 'a';
        System.out.println("charVar = " + charVar);

        // Tipos de datos booleanos
        boolean booleanVar = true;
        System.out.println("booleanVar = " + booleanVar);

        // Tipos de datos de referencia
        String stringVar = "Hola mundo";
        System.out.println("stringVar = " + stringVar);

        // Tipos de datos de clase
        Integer integerVar = 2147483647;
        System.out.println("integerVar = " + integerVar);
        Double doubleVar2 = 1.7976931348623157E308;
        System.out.println("doubleVar2 = " + doubleVar2);
        Character characterVar = 'a';
        System.out.println("characterVar = " + characterVar);
        Boolean booleanVar2 = true;
        System.out.println("booleanVar2 = " + booleanVar2);

        // Tipos de datos de arreglo
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println("intArray = " + intArray);
        String[] stringArray = {"Hola", "mundo"};
        System.out.println("stringArray = " + stringArray);


        // Tipos de datos de clase abstracta
        abstract class Animal {
            public abstract void comer();
        }
        // Tipos de datos de clase final
        final class Perro {
            public void ladrar() {
                System.out.println("Guau");
            }
        }
        // Tipos de datos de clase anónima
        Animal animalVar = new Animal() {
            @Override
            public void comer() {
                System.out.println("Comiendo");
            }
        };
        // Tipos de datos de clase anidada
        class Animal3 {
            class Perro {
                public void ladrar() {
                    System.out.println("Guau");
                }
            }
        }
    }
}

