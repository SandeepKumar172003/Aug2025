package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lab14_testNG {
	WebDriver driver;
  @Test(dataProvider = "dp")

  public void f(String firstname, String lastname, String email_id, String phnnumber,
                String password, String confirmpassword) throws InterruptedException {
      // your logic...
  

	  Thread.sleep(3000);
	  String title=driver.getTitle();
	  System.out.println("Title:"+title);
//	  ExtentReports extent=new ExtentReports();
//	  String reportpath=projectpath+"\\param";
	  if(title.equals("Your Store"))//Verify Title
		{
			System.out.println(	"title is matched");
		}
		else
		{
			System.out.println("title is not matched");
		}
	 driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();//MyAccount
	 driver.findElement(By.linkText("Register")).click();//Registerbutton
	WebElement text=driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
	 if(text.getText().equals("Register Account")) {
		 System.out.println("Text is matched");
	 }
	 else {
		 System.out.println("text is mismatched");
	 }
	 //Enter all the details in the First name, Last Name, E-Mail, Telephone, Password,  Password Confirm from the excel sheet (UserDetails.xls)
	 driver.findElement(By.name("firstname")).sendKeys(firstname);//first name
	 driver.findElement(By.name("lastname")).sendKeys(lastname);
	 driver.findElement(By.name("email")).sendKeys(email_id);
	 driver.findElement(By.name("telephone")).sendKeys(String.valueOf(phnnumber));
	 driver.findElement(By.name("password")).sendKeys(password);
	 driver.findElement(By.name("confirm")).sendKeys(confirmpassword);
	// Click on checkbox of newsLetter
	 driver.findElement(By.name("newsletter")).click();
  driver.findElement(By.name("agree")).click();//Privacy 
  driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();//continue
 
  
  }
  @BeforeMethod
  public void beforeMethod() {

		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.get("https://tutorialsninja.com/demo/index.php");
		  
	  }
  

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() throws IOException {
	  String[][] data=new String[2][6];
	  String projectpath=System.getProperty("user.dir");
	  String file=new String(projectpath+"\\user_details.xlsx");
	  FileInputStream fs=new FileInputStream(file);
	  XSSFWorkbook workbook=new XSSFWorkbook(fs);
	  XSSFSheet worksheet=workbook.getSheetAt(0);
	  int rowcount=worksheet.getPhysicalNumberOfRows();
	  System.out.println("rows:"+rowcount);
	  
	  for(int i=0;i<rowcount;i++)
	  {
		  data[i][0]=worksheet.getRow(i).getCell(0).getStringCellValue();
		  data[i][1]=worksheet.getRow(i).getCell(1).getStringCellValue();
		  data[i][2]=worksheet.getRow(i).getCell(2).getStringCellValue();
		  data[i][3]=worksheet.getRow(i).getCell(3).toString();
		  data[i][4]=worksheet.getRow(i).getCell(4).getStringCellValue();
		  data[i][5]=worksheet.getRow(i).getCell(5).getStringCellValue();
	  }
	  
	  return data;
	  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}