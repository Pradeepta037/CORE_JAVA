public class F21 {
    public static void main(String[] args) {
        ChildExample child = new ChildExample();
        child.callProtectedGreet();
    }
}

class ParentExample {
    // This is a protected method
    protected void protectedGreet() {
        System.out.println("Hello from a protected method!");
    }
}

class ChildExample extends ParentExample {
    // This method calls the protected method from the parent class
    public void callProtectedGreet() {
        protectedGreet();
    }
}
