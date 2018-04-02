package najah.edu;


//import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.*;





public class TestFacebookWithJunit {


	
	static WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Najwa\\Documents\\uni\\software\\facebook\\geckodriver.exe");
		driver=new FirefoxDriver();
	}

	
	@Test
	public void test() {
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("myemail");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("123456");

		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
	}

}
