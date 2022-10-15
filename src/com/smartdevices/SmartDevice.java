package com.smartdevices;

public class SmartDevice {
    protected String tipoDispositivo;
    protected String marca;
    protected String modelo;


    public SmartDevice(){
        System.out.println("Se creo un dispositivo inteligente");
    }

    public SmartDevice(String tipoDispositivo, String marca, String modelo){
        this.tipoDispositivo = tipoDispositivo;
        this.marca = marca;
        this.modelo = modelo;
    }


    @Override
    public String toString() {
        return "SmartDevice{" +
                "tipoDispositivo='" + tipoDispositivo + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
