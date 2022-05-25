package week2.day2.assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class EditLead1 {
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
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Milton");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']"));
		String LeadId = ele1.getText();
		ele1.click();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@name='companyName' and @class='inputBox']")).clear();
		String a = "New company";
		String b = a +" ("+LeadId+")";
		driver.findElement(By.xpath("//input[@name='companyName' and @class='inputBox']")).sendKeys(a);
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		WebElement ele2 = driver.findElement(By.id("viewLead_companyName_sp"));
		String updated = ele2.getText();
		if(b.equals(updated)) {
			System.out.println("Company name was updated");
		}
		else {
			System.out.println("Company name wasn't updated");
		}
		driver.close();
	}

}
