package com.smartdevices;

public class SmartWatch extends SmartDevice {
    protected static Integer numeroSerie = 0;
    Integer tamanioBisel;
    String sistemaOperativoReloj;
    Boolean esPropietario;
    Boolean esSumergible;
    
    public SmartWatch(){
        System.out.println("Se creo un reloj inteligente");
    }

    public SmartWatch(SmartDevice smartDevice,
                      Integer tamanioBisel, String sistemaOperativoReloj, Boolean esPropietario, Boolean esSumergible){
        super(smartDevice.tipoDispositivo, smartDevice.marca, smartDevice.modelo);
        ++SmartWatch.numeroSerie;
        this.tamanioBisel = tamanioBisel;
        this.sistemaOperativoReloj = sistemaOperativoReloj;
        this.esPropietario = esPropietario;
        this.esSumergible = esSumergible;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                super.toString() +
                "tamanioBisel=" + tamanioBisel +
                ", sistemaOperativoReloj='" + sistemaOperativoReloj + '\'' +
                ", esPropietario=" + esPropietario +
                ", esSumergible=" + esSumergible +
                '}';
    }
}
