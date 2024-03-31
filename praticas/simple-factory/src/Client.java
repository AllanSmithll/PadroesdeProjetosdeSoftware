import factory.LaptopFactory;
import model.Laptop;

public class Client {
    public static void main(String[] args) {
        Laptop normalLaptop = LaptopFactory.createLaptop("Normal");
        Laptop gamingLaptop = LaptopFactory.createLaptop("Gaming");
        Laptop nulo = LaptopFactory.createLaptop("Nulo");
        normalLaptop.runTests();
        gamingLaptop.runTests();
        nulo.runTests();
    }
}