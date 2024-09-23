package model;

public class Triangle extends Shape {
    public int base;
    public int height;

    public Triangle() {}

    public Triangle(Triangle target) {
        super(target);
        if (target != null) {
            this.base = target.base;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Triangle(this);
    }

    @Override
    public String toString() {
        return "Triangle: [x=" + x + ", y=" + y + ", color=" + color + ", base=" + base + ", height=" + height + "]";
    }
}
