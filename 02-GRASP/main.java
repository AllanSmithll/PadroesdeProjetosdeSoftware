import models.classes.Car;
import models.classes.Motor;
import models.classes.Plane;

public class main {
    public static void main(String[] args) {
        Motor m1 = new Motor();
        Plane p1 = new Plane("1", 2.0, 2.0, 3.0);
        System.out.println(p1.calculateDiary());
        Car c1 = new Car("1", 2.0, m1, "ABC");
        System.out.println(p1.calculateDiary());
    }
}
