import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class F18 {
    public static void main(String[] args) {
        displayCurrentDateTime();
    }

    // This is a parameter-less method
    public static void displayCurrentDateTime() {
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        
        // Format the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
        String formattedDateTime = currentDateTime.format(formatter);
        
        // Print the formatted date and time
        System.out.println("Current Date and Time: " + formattedDateTime);
    }
}
