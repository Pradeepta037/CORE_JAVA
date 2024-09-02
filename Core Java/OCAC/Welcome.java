public class Welcome {
    public static void main(String[] args) {

        // int count=0;
        // System.out.println("Hello, World!!");
        // Person p1 = new Person();

        // p1.name = "Mini";
        // p1.age = 18;
        // p1.weight = 45.5667;

        // Person p2 = new Person();
        Person p3 = new Person("Mr. Bean", 18);

        p3.setName("Mr. Max");
        p3.getName();

        // p2.name = "Max";
        // p2.age = 20;
        // p2.weight = 58.9766;

        // System.out.println(p1.name + " " + p1.age + " " + p1.weight);
        // System.out.println(p2.name + " " + p2.age + " " + p2.weight);

        // p1.walk(5);
        // p1.walk();
        // p2.walk(4,700);
        // p2.eat();
        
        // System.out.println(Person.count);
        

    }
}

class Person{

    String name;
    int age;
    // double weight;

    // static int count=0;

    public Person(){
        // count++;
        System.out.println("The Constructor is call.");
    }

    Person(String name, int age){
        this();
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    
    // Update the value of the name, age, weight

    void walk(){
        System.out.println(name + " is walking");
    }

    void walk(int steps){
        System.out.println(name + " is walking " + steps + " steps");
    }

    void walk(int km, int m){
        System.out.println(name + " is walking " + km + " kilometer" + m + " meter");
    }

    void eat(){
        System.out.println(name + " is eating");
    }
}

