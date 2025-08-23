package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tc0010_sync {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub		
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				WebElement username=wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
	driver.findElement(By.name("username")).sendKeys("Admin");

	}

}
