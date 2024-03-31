package factory;

import model.GamingLaptop;
import model.Laptop;
import model.LaptopNull;
import model.NormalLaptop;

public class LaptopFactory {

    public static Laptop createLaptop(String type) {
        if (type.equals("Normal")) return new NormalLaptop();
        if (type.equals("Gaming")) return new GamingLaptop();
        return new LaptopNull();
    }
}
