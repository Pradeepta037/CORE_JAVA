public class F11 {
    public static void main(String[] args) {
        char initial = getInitial("John");
        System.out.println("Initial: " + initial);
    }

    // Function that returns a char
    public static char getInitial(String name) {
        return name.charAt(0);
    }
}
