package model;

public abstract class Shape implements Cloneable {
    public int x;
    public int y;
    public String color;

    public Shape() {}

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    @Override
    public abstract Shape clone();
}

