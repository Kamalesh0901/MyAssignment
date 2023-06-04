package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.leafground.com/window.xhtml");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> handles = driver.getWindowHandles();
		List<String> newWindow = new ArrayList<String>(handles);
		driver.switchTo().window(newWindow.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(newWindow.get(0));
		
		//Find the number of opened tabs


		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> multiple = driver.getWindowHandles();
		List<String> newMultiple = new ArrayList<String>(multiple);
		System.out.println(newMultiple.size());
		driver.switchTo().window(newMultiple.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(newMultiple.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(newMultiple.get(1));
		driver.close();	
		driver.switchTo().window(newMultiple.get(0));
		
		//Close all windows except Primary
		
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> alert = driver.getWindowHandles();
		List<String> newAlert =new ArrayList<String>(alert);
		driver.switchTo().window(newAlert.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(newAlert.get(2));
		System.out.println(driver.getTitle());
		driver.switchTo().window(newAlert.get(3));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(newAlert.get(2));
		driver.close();
		driver.switchTo().window(newAlert.get(1));
		driver.close();
		driver.switchTo().window(newAlert.get(0));
		
		//Wait for 2 new tabs to open
		
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Set<String> delay = driver.getWindowHandles();
		List<String>newDelay =new ArrayList<String>(delay);
		driver.switchTo().window(newDelay.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(newDelay.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(newDelay.get(1));
		driver.close();
		driver.switchTo().window(newDelay.get(0));
		
		
		
		
		
		
	

	}

}
