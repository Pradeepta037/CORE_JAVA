public class F15 {
    public static void main(String[] args) {
        String greeting = getGreeting("Sujit");
        System.out.println(greeting);
    }

    // Function that returns a String
    public static String getGreeting(String name) {
        return "Hello, " + name + "!";
    }
}
