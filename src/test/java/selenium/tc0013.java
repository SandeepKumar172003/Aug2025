package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tc0013 {
  @Test(priority=3)
  public void test1() {
	  System.out.println("this is test1");
	  WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
  }
  @Test(priority =1)
  public void test2() {
	  System.out.println("this is test2");
	  WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://yahoo.com/");
  } 
  @Test(priority =2)
  public void test3() {
	  System.out.println("this is test3");
	  WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
  }
}