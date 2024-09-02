public class Main1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display("Audi");
    }
}

class Car{
    String name;

    void display(String name){
        System.out.println("The Car name is " + name);
    }
}
