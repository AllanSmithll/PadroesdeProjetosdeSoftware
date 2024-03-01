package models.classes;

import models.interfaces.Veicule;

public abstract class Car implements Veicule {
    private static String identification;

    @Override
    public String getIdentification() {
        return identification;
    }
}
