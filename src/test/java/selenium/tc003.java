package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tc003 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.automationpractice.pl/index.php?");
	driver.findElements(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
	List<WebElement>l1=driver.findElements(By.xpath("//input[@type='text']"));
	System.out.println(l1.size());
	}

}
