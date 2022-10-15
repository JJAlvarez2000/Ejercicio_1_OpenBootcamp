package com.smartdevices.test;
import com.smartdevices.*;

public class TestSmartDevices {
    public static void main(String[] args) {
        SmartDevice telefono1 = new SmartDevice("Telefono", "Samsung", "Galaxy S10");
        SmartPhone telefono = new SmartPhone(telefono1, "Android", "Celular", 128, 8, 4000);

        SmartDevice reloj1 = new SmartDevice("Reloj", "Apple", "Watch 5");
        SmartWatch reloj = new SmartWatch(reloj1, 45, "iOS", true, true);

        System.out.println(telefono);
        System.out.println(reloj);

    }
}
