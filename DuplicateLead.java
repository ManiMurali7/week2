package week2.day2.assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DuplicateLead {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\manmzma\\eclipse-workspace1\\SeleniumMay22\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//span[@class='x-tab-strip-text ' and text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("an");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext']"));
		String leadName = ele1.getText();
		ele1.click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String pageTitle = driver.getTitle();
		String a = "Duplicate Lead | opentaps CRM";
		if(a.equals(pageTitle)) {
			System.out.println("Page title verified");
		}
		else {
			System.out.println("Page title mismatch");
		}
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		WebElement ele2 = driver.findElement(By.id("viewLead_firstName_sp"));
		String dup = ele2.getText();
		if(dup.equals(leadName)) {
			System.out.println("Duplicated lead name is same as original lead name");
		}
		else {
			System.out.println("Error in duplication");
		}
		driver.close();
	}
}

