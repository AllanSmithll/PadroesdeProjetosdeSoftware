import model.Circle;
import model.Rectangle;
import model.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "Red";

        Circle clonedCircle = (Circle) circle.clone();
        System.out.println("Círculo: " + circle);
        System.out.println("Círculo clonado: " + clonedCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.x = 5;
        rectangle.y = 10;
        rectangle.width = 20;
        rectangle.height = 30;
        rectangle.color = "Blue";

        Rectangle clonedRectangle = (Rectangle) rectangle.clone();
        System.out.println("Retângulo: " + rectangle);
        System.out.println("Retângulo clonado: " + clonedRectangle);

        Triangle triangle = new Triangle();
        triangle.x = 0;
        triangle.y = 0;
        triangle.base = 10;
        triangle.height = 25;
        triangle.color = "Green";

        Triangle clonedTriangle = (Triangle) triangle.clone();
        System.out.println("Triângulo: " + triangle);
        System.out.println("Triângulo clonado: " + clonedTriangle);
    }
}
