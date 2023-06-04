package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/frame.xhtml");
		
		//inside frame
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//button[text()='Click Me'])[1]")).click();
		Thread.sleep(1000);
		String text = driver.findElement(By.xpath("(//button[@id='Click'])[1]")).getText();
		System.out.println(text);
		Thread.sleep(1000);
		
		//Nested frame
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
	    driver.findElement(By.xpath("//button[contains(text(),'Click ')]")).click();
	    Thread.sleep(1000);
	    String text2 = driver.findElement(By.xpath("//button[contains(text(),'Hurray!')]")).getText();
	    System.out.println(text2);
	    Thread.sleep(1000);
	    
	  //To find the count of  Frames
	    
	   driver.switchTo().defaultContent();
	   List<WebElement> count = driver.findElements(By.tagName("iframe"));
	   Thread.sleep(1000);
	   System.out.println(count.size());
	   
	    
		

	}

}
