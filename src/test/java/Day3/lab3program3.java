package Day3;

import com.cg.eis.exception.EmployeeException;

public class lab3program3 {
    public static void main(String[] args) 
    {
        int salary = 2500;

        try
        {
            validateSalary(salary);
            System.out.println("Salary is valid: " + salary);
        } 
        catch (EmployeeException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void validateSalary(int salary) throws EmployeeException 
    {
        if (salary < 3000) 
        {
            throw new EmployeeException("Salary must be at least 3000.");
        }
    }
}