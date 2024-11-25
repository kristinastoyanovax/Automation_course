/*
Develop a Shape class that can calculate the area of a shape. This class should have a
method to display the calculated area.
• Create a Circle class that inherits from the Shape class. This class should be able to
calculate the area of a circle based on its radius.
• Create a Rectangle class that inherits from the Shape class. This class should be able
to calculate the area of a rectangle based on its width and height.
• Create objects for each class. Assign them to variables of type Shape. Display the
calculated area for each object.
Hints:
• When you use Shape class to calculate the area it should return 0 by default since Shape
is too generic to be bind to a specific formula
• Create specific attributes in Circle and Rectangle class. Use them to calculate the area
• Use Inheritance and Polymorphism
 */
public class Exercise01 {
    public static void main(String[] args) {
        Shape shape1 = new Circle(3.5f);
        Shape shape2 = new Rectangle(4.5f, 6);

        System.out.println(shape1.calcArea());
        System.out.println(shape2.calcArea());
    }
}
