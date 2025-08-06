package Day3;

class NameBlankException extends Exception {
	 public NameBlankException(String message) {
	     super(message);
	 }
	}

	public class lab3program1 {
	 public static void main(String[] args) {
	     String firstName = "Sandeep";
	     String lastName = "Polepalle";

	     try {
	         validateName(firstName, lastName);
	         System.out.println("Employee name is valid: " + firstName + " " + lastName);
	     }
	     catch (NameBlankException e)
	     {
	         System.out.println("Error: " + e.getMessage());
	     }
	 }

	 public static void validateName(String firstName, String lastName) throws NameBlankException
	 {
	     if (firstName.isEmpty() || lastName.isEmpty())
	     {
	         throw new NameBlankException("First name or last name cannot be blank.");
	     }
	 }
	}