public class Cylinder implements InterfaceC {
    private float radius;
    private float height;
    private String color;

    public Cylinder() {
    }

    public Cylinder(float radius, float height, String color) {
        this.radius = radius;
        this.height = height;
        this.color = color;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double volume() {
        return PI * this.radius * this.radius * this.height;
    }

    @Override
    public double area() {
        return PI * this.radius * this.radius * 2 + 2 * PI * this.radius * this.height;
    }

    @Override
    public void setColor(String c) {
        this.color = c;
    }
}
