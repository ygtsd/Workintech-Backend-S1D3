package org.example;

public class Wall {
    double width;
    double height;

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
        if (this.height < 0) this.height = 0;
    }

    public void setWidth(double width) {
        this.width = width;
        if (this.width < 0) this.width = 0;
    }

    public double getArea() {
        return width*height;
    }
}
