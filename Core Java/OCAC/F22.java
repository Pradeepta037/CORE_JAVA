public class F22 {
    public static void main(String[] args) {
        int original = 10;
        modifyPrimitive(original);
        System.out.println("After calling modifyPrimitive: " + original); 
    }

    public static void modifyPrimitive(int number) {
        number = 20;
        System.out.println("Inside modifyPrimitive: " + number); 
    }
}
