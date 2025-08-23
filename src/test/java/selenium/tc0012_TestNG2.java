package selenium;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tc0012_TestNG2 {

	WebDriver driver;
	Properties objprop;

	@BeforeMethod
	public void before() throws IOException {
		
		String projectPath = System.getProperty("user.dir");
		FileInputStream file = new FileInputStream(projectPath + "\\lab12properties");
		objprop = new Properties();
		objprop.load(file);

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(objprop.getProperty("url"));
	}

	@Test
	public void registerUserTest() throws InterruptedException {
	
		Assert.assertEquals(driver.getTitle(), "Your Store", "Page title mismatch!");

		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();

		WebElement heading = driver.findElement(By.xpath("//h1[text()='Register Account']"));
		Assert.assertTrue(heading.isDisplayed(), "Register heading not displayed!");


		driver.findElement(By.id("input-firstname")).sendKeys(objprop.getProperty("firstname"));
		driver.findElement(By.id("input-lastname")).sendKeys(objprop.getProperty("lastname"));
		driver.findElement(By.id("input-email")).sendKeys(objprop.getProperty("email"));
		driver.findElement(By.id("input-telephone")).sendKeys(objprop.getProperty("telephone"));
		driver.findElement(By.id("input-password")).sendKeys(objprop.getProperty("password"));
		driver.findElement(By.id("input-confirm")).sendKeys(objprop.getProperty("confirmPassword"));

		driver.findElement(By.xpath("//input[@name='newsletter' and @value='1']")).click();
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		try {
            WebElement successMessage = driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']"));
            if (successMessage.isDisplayed()) {
                System.out.println("Success: " + successMessage.getText());
                Assert.assertTrue(true);
            }
        } catch (Exception e) {
            WebElement warning = driver.findElement(By.xpath("//div[contains(@class,'alert-danger')]"));
            System.out.println("Account already exists: " + warning.getText());
            Assert.assertTrue(warning.isDisplayed(), "Warning message not displayed!");
        }
	}

	@AfterMethod
	public void after() {
		driver.quit();
	}

}