package model;

public class Circle extends Shape {
    public int radius;

    public Circle() {}

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle: [x=" + x + ", y=" + y + ", color=" + color + ", radius=" + radius + "]";
    }
}

