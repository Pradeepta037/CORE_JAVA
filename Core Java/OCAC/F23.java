public class F23 {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        modifyObject(person);
        System.out.println("After calling modifyObject: " + person.getName());
    }

    public static void modifyObject(Person p) {
        p.setName("Bob");
        System.out.println("Inside modifyObject: " + p.getName());
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
