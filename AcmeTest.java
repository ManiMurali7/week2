package week2.day2.assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class AcmeTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\manmzma\\eclipse-workspace1\\SeleniumMay22\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://acme-test.uipath.com/login");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[contains(@onclick,'event.preventDefault()')]")).click();
		Thread.sleep(2500);
		// to verify if logged out
		driver.close();
	}
}
