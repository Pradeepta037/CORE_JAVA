package javalearners;

import learner.*; // Import the Student class

public class StudentAccess {
    public static void main(String[] args) {
        // Create an instance of Student
        Student student = new Student("Jane Smith", 67890, 'B', 22);

        // Accessing fields of Student class from a different package
        System.out.println("Accessing from a different package:");
        System.out.println("Name: " + student.name);    // Public field
        // System.out.println("ID: " + student.id);    // Private field (not accessible)
        // System.out.println("Grade: " + student.grade);  // Protected field (not accessible)
        // System.out.println("Age: " + student.age);      // Default access field (not accessible)

        // The display method is not accessible due to the class being in a different package
    }
}

