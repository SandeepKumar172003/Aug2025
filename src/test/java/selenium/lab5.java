package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.opencart.com/");
		String title=driver.getTitle();
		if (title.equals("Opencart-open source shoppping cart solution")) {
			System.out.println("Title is matched");
		} else {
			System.out.println("Title is not matched");

		}
		driver.navigate().to("https://www.yahoo.com/");
		System.out.println("url is:"+driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println("url is:"+driver.getCurrentUrl());
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println("url is:"+driver.getCurrentUrl());
		System.out.println("page source is:"+driver.getPageSource());
		
		
		

	}

}