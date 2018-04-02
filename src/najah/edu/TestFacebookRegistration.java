package najah.edu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestFacebookRegistration {
static WebDriver driver;
public static void main(String []ar)
{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Najwa\\Documents\\uni\\software\\facebook\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("myemail");
	driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("123456");

	
	driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
	
}
}