package week2.day1.assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("AMAZON");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manikandan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Murali");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sabari");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Quality service Associate");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Will work on CS related projetcs and will execute testing to fullest");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("maniswar3005@amazon.com");
		WebElement element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropDwn = new Select(element);
		dropDwn.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important Note should be updated");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(5000);
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
	}

}

