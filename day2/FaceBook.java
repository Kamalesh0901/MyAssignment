package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		
	    ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Kamalesh");
		driver.findElement(By.name("lastname")).sendKeys("Thulasidass");
		driver.findElement(By.name("reg_email__")).sendKeys("8248470671");
		driver.findElement(By.id("password_step_input")).sendKeys("Kamal7917");
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	      Select sel= new Select(day);
	      sel.selectByIndex(8);
	      WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	      Select sel1= new Select(month);
	      sel1.selectByValue("1");
	      WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	      Select sel2= new Select(year);
	      sel2.selectByVisibleText("2000");
	      driver.findElement(By.xpath("//label[text()='Male']")).click();
	     	

	}

}
