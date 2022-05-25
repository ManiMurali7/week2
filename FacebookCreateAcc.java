package week2.day2.assignments;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FacebookCreateAcc {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\manmzma\\eclipse-workspace1\\SeleniumMay22\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@data-type='text' and @name='firstname']")).sendKeys("Saranya"); 
		driver.findElement(By.xpath("//input[@data-type='text' and @name='lastname']")).sendKeys("Mani"); 
		driver.findElement(By.xpath("//input[@data-type='text' and @name='reg_email__']")).sendKeys("9840196857"); 
		driver.findElement(By.xpath("//input[@data-type='password' and @name='reg_passwd__']")).sendKeys("Mani123456");
		WebElement ele1 = driver.findElement(By.xpath("//select[@id='day' and @name='birthday_day']"));
		Select bday1 = new Select(ele1);
		bday1.selectByValue("9");
		WebElement ele2 = driver.findElement(By.xpath("//select[@id='month' and @name='birthday_month']"));
		Select bmon = new Select(ele2);
		bmon.selectByValue("12");
		WebElement ele3 = driver.findElement(By.xpath("//select[@id='year' and @name='birthday_year']"));
		Select byr = new Select(ele3);
		byr.selectByValue("1997");
		driver.findElement(By.xpath("//input[@value='1' and @name='sex']")).click();
	}
}
