package selenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tc011 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.findElement(By.name("username")).sendKeys("Admin");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement username=wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
		username.sendKeys("Admin");

	}

}