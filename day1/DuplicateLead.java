package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(1000);
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("CRM")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kamalesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thulasidass");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kamalesh");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Software Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kamaleshoffical09@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf Software Solutions");
		Thread.sleep(1000);
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("T.Kamalesh");
		Thread.sleep(1000);
		driver.findElement(By.name("submitButton")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		

	}

}
