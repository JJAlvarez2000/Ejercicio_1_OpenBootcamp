package com.funcionprecioiva;

public class PrecioIva {
    public static void main(String[] args) {
        // Funciones

        calcularPrecioConIva(1000, 0.21);

    }
    // Función que calcula el precio con IVA
    private static void calcularPrecioConIva(double precio, double iva) {
        double precioConIva = precio + (precio * iva);
        System.out.println("precioConIva = " + precioConIva);
    }
}
