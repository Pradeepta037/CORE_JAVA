public class F14 {
    public static void main(String[] args) {
        boolean isEven = checkEven(4);
        System.out.println("Is the number even? " + isEven);
    }

    // Function that returns a boolean
    public static boolean checkEven(int number) {
        return number % 2 == 0;
    }
}
