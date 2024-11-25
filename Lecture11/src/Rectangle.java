public class Rectangle extends Shape {
    float width;
    float height;
    @Override
    public float calcArea() {
        return width * height;
    }

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }
}
