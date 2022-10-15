package com.smartdevices;

public class SmartPhone extends SmartDevice {
    protected static Integer numeroSerie = 0;

    String sistemaOperativoTelefono;
    String tipoTelefono;
    Integer capacidadAlmacenamiento;
    Integer capacidadRAM;
    Integer capacidadBateria;

    public SmartPhone(){
        System.out.println("Se creo un telefono inteligente");
    }

    public SmartPhone(SmartDevice smartDevice,
                      String sistemaOperativoTelefono, String tipoTelefono, Integer capacidadAlmacenamiento,
                      Integer capacidadRAM, Integer capacidadBateria){
        super(smartDevice.tipoDispositivo, smartDevice.marca, smartDevice.modelo);
        ++SmartPhone.numeroSerie;
        this.sistemaOperativoTelefono = sistemaOperativoTelefono;
        this.tipoTelefono = tipoTelefono;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.capacidadRAM = capacidadRAM;
        this.capacidadBateria = capacidadBateria;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                super.toString() +
                "sistemaOperativoTelefono='" + sistemaOperativoTelefono + '\'' +
                ", tipoTelefono='" + tipoTelefono + '\'' +
                ", capacidadAlmacenamiento=" + capacidadAlmacenamiento +
                ", capacidadRAM=" + capacidadRAM +
                ", capacidadBateria=" + capacidadBateria +
                '}';
    }
}
