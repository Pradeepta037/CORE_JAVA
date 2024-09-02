public class F20 {
    public static void main(String[] args) {
        F20 example = new F20();
        example.callPrivateGreet();
    }

    // This method calls the private method
    public void callPrivateGreet() {
        privateGreet();
    }

    // This is a private method
    private void privateGreet() {
        System.out.println("Hello from a private method!");
    }
}
