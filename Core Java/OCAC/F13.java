public class F13 {
    public static void main(String[] args) {
        double circumference = calculateCircumference(7.0);
        System.out.println("Circumference: " + circumference);
    }

    // Function that returns a double
    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}
