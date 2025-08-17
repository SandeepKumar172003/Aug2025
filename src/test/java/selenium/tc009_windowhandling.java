package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tc009_windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/window");
		driver.findElement(By.id("home")).click();
		     String pwimdow=driver.getWindowHandle();
		     System.out.println("parent window:"+pwimdow);
		     System.out.println("url is:"+driver.getCurrentUrl());
		     driver.findElement(By.id("multi")).click();
		     Set<String>mwindows=driver.getWindowHandles();
		     
		     for(String cwindow:mwindows)
		     {
		    	driver.switchTo().window(cwindow);
		    	System.out.println("url is:"+driver.getCurrentUrl());
		     }
		    	 

	}

}
