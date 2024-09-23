package model;

public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle() {}

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle: [x=" + x + ", y=" + y + ", color=" + color + ", width=" + width + ", height=" + height + "]";
    }
}

