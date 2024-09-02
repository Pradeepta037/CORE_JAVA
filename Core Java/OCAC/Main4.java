class Student {
    String name;
    int age;
    boolean IsStudent;

    // Method to display attributes of the student
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student: " + IsStudent);
    }
}

public class Main4 {
    public static void main(String[] args) {
        // Creating a Student object using the default constructor
        Student student = new Student();
        // Displaying the attributes of the student
        student.display();
    }
}
