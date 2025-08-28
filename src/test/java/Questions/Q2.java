package Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Q2 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();  
    }

    @Test
    public void loginTest() {
        
        driver.get("https://the-internet.herokuapp.com/login");

       
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("tomsmith");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");

       
        WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit']"));
        loginBtn.click();

        
        WebElement successMsg = driver.findElement(By.id("flash"));
        String msgText = successMsg.getText();

        System.out.println("Login Message: " + msgText);

        
        Assert.assertTrue(msgText.contains("You logged into a secure area!"), "Login Failed!");
    }
}