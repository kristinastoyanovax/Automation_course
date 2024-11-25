public class Circle extends Shape {
    float radius;
    @Override
    public float calcArea() {
        return 3.14f * (radius * radius);
    }

    public Circle(float radius) {
        this.radius = radius;
    }
}
