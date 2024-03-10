import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class student {
    private String name;
    private Date dateOfBirth;

    // Constructor
    public student(String name, String dob) {
        this.name = name;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); // Specify the date format
            this.dateOfBirth = sdf.parse(dob); // Parse the date string to create a Date object
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    // Method to display student name
    public void displayStudentName() {
        System.out.println("Student Name: " + name);
    }

    // Method to display age of student
    public void displayStudentAge() {
        Date currentDate = new Date(); // Get the current date
        long ageInMillis = currentDate.getTime() - dateOfBirth.getTime(); // Calculate the difference in milliseconds
        long ageInYears = ageInMillis / (1000L * 60 * 60 * 24 * 365); // Convert milliseconds to years
        System.out.println("Student Age: " + ageInYears + " years");
    }

    public static void main(String[] args) {
        // Create a Student object
        student student = new student("John Doe", "01-01-2000");
        
        // Display student information
        student.displayStudentName();
        student.displayStudentAge();
    }
}
