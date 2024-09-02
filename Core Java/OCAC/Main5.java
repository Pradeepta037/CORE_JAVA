class Rectangle {
    double length;
    double breadth;

    // No-arg constructor
    Rectangle() {
        length = 0;
        breadth = 0;
    }

    // Constructor with two parameters
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to display attributes of the rectangle
    void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area());
    }

    // Method to calculate the area of the rectangle
    double area() {
        return length * breadth;
    }
}

public class Main5 {
    public static void main(String[] args) {
        // Creating a rectangle using the no-arg constructor
        Rectangle rect1 = new Rectangle();
        System.out.println("Rectangle 1:");
        rect1.display();

        // Creating a rectangle using the constructor with parameters
        Rectangle rect2 = new Rectangle(10.5, 5.5);
        System.out.println("\nRectangle 2:");
        rect2.display();
    }
}
