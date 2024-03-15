import models.classes.Car;
import models.classes.Plane;

public class main {
    public static void main(String[] args) {
        Plane p1 = new Plane("2024030400001", 2.0, 2.0, 3.0);
        System.out.println(p1.calculateDiary());
        Car c1 = new Car("2024030400002", 2.0, "1.0", "ABC", 20.0);
        System.out.println(p1.calculateDiary());
    }
}
