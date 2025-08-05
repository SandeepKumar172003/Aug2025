package Day1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
//Warranty expries
public class lab13{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a product purchase date ");
        String purchasedate = sc.nextLine();
        LocalDate date = LocalDate.parse(purchasedate);
        System.out.print("Enter the warratnt years and months");
        int years=sc.nextInt();
        int months=sc.nextInt();
        
       LocalDate expiryDate=date.plusYears(years).plusMonths(months);
       
 
        System.out.println("warranty Expiry Date : " +expiryDate);

    
    }
}
