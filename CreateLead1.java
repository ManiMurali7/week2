package week2.day2.assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class CreateLead1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\manmzma\\eclipse-workspace1\\SeleniumMay22\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Manikandan");
		driver.findElement(By.id("lastNameField")).sendKeys("Murali");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sabari");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Thala");
		driver.findElement(By.className("inputBox")).sendKeys("Quality service Associate");
		driver.findElement(By.name("description")).sendKeys("Will work on CS related projetcs and will execute testing to fullest");
		driver.findElement(By.name("primaryEmail")).sendKeys("maniswar3005@amazon.com");
		WebElement element = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dropDwn = new Select(element);
		dropDwn.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Clear case executed succesfully");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
	}
}