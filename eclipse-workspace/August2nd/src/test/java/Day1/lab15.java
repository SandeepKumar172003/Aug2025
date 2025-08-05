package Day1;
import java.time.LocalDate;
import java.time.Period;
//Details and DOB
public class lab15 {

    public static int calculateAge(LocalDate dob) {
        LocalDate currentDate = LocalDate.now();
        if (dob != null && !dob.isAfter(currentDate)) {
            return Period.between(dob, currentDate).getYears();
        } else {
            return 0;
        }
    }

    // Method to return full name
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        // Sample data
        String firstName = "Sandeep";
        String lastName = "Polepalle";
        LocalDate dob = LocalDate.of(2002,10, 17);// Example DOB

        String fullName = getFullName(firstName, lastName);
        int age = calculateAge(dob);

        // Display results
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age + " years");
    }
}
