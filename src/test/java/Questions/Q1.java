package Questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Q1 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();  
    }

    @Test
    public void openGoogle() {
        driver.get("https://www.google.com");  
        System.out.println("Page title is: " + driver.getTitle()); 
    }
}