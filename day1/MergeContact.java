package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
       ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.get("http://leaftaps.com/opentaps/control/login");
       driver.findElement(By.id("username")).sendKeys("demosalesmanager");
       driver.findElement(By.id("password")).sendKeys("crmsfa");
       driver.findElement(By.className("decorativeSubmit")).click();
       driver.findElement(By.partialLinkText("CRM")).click();
       driver.findElement(By.xpath("//a[text()='Contacts']")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
       driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
       Set<String> fromContact = driver.getWindowHandles();
       List<String> fromContact1= new ArrayList<String>(fromContact);
       driver.switchTo().window(fromContact1.get(1));
       driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
       driver.switchTo().window(fromContact1.get(0));
       
       driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
       Set<String> toContact = driver.getWindowHandles();
       List<String> toContact2= new ArrayList<String>(toContact);
       driver.switchTo().window(toContact2.get(1));
       driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]")).click();
       driver.switchTo().window(toContact2.get(0));
       driver.findElement(By.xpath("//a[text()='Merge']")).click();
       
       Alert alertpopup = driver.switchTo().alert();
       alertpopup.accept();
       System.out.println(driver.getTitle());
       driver.close();
       
       
	}

}
