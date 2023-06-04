package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		//simple dialougebox
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		org.openqa.selenium.Alert simAlert = driver.switchTo().alert();
		simAlert.accept();
		String text = driver.findElement(By.xpath("//span[text()='You have successfully clicked an alert']")).getText();
		System.out.println(text);
		//confirm dialougebox
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		org.openqa.selenium.Alert conAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(conAlert.getText());
		conAlert.dismiss();
		String text1 = driver.findElement(By.xpath("//span[text()='User Clicked : Cancel']")).getText();
		System.out.println(text1);
		//sweet Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		String text2 = driver.findElement(By.xpath("//div[@class='ui-dialog-content ui-widget-content']/p")).getText();
		System.out.println(text2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		//Sweet Modal
		
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		Thread.sleep(1000);
		String text3 = driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content'])[2]/p")).getText();
		Thread.sleep(1000);
		System.out.println(text3);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Modal Dialog (Sweet Alert)']/following::span")).click();
		Thread.sleep(3000);
		
		
		//prompt 
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Thread.sleep(1000);
		org.openqa.selenium.Alert promptAlert= driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		promptAlert.sendKeys("Kamalesh");
		promptAlert.accept();
		Thread.sleep(1000);
		String text4 = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text4);
		
		//Sweet Alert
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		String text5 = driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content'])[4]")).getText();
		System.out.println(text5);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		Thread.sleep(1000);
		
		//Minimize and Maximize
		driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
		String text6 = driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content'])[3]/p")).getText();
		System.out.println(text6);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'])[3]")).click();
		Thread.sleep(1000);

		

		
		

	}

}
