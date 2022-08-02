package week2.day;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("src")).sendKeys("Chennai");
		driver.findElement(By.className("selected")).click();
		driver.findElement(By.id("dest")).sendKeys("Banglore");
		driver.findElement(By.className("selected")).click();
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("//td[@class='current day']/following-sibling::td")).click();
		 driver.findElement(By.id("search_btn")).click();
	  //  driver.findElement(By.xpath("//td[text()='22']")).click();
		 String Busesfound=driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		 System.out.println("The number of buses shown as result is "+Busesfound);
		 //sleeper
		 driver.findElement(By.xpath("//label[text()='SLEEPER']")).click();
		 Thread.sleep(3000);
		 //print name of bus
		 String SecondBusName=driver.findElement(By.xpath("//div[contains(@class,'column-two p-right-10')]//div[3]")).getText();
		 System.out.println("The name of second bus i "+SecondBusName);
		 Thread.sleep(3000);
		 //popup
	    driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
	    //view seats
	    driver.findElement(By.xpath("//div[@class='button view-seats fr'])[2]")).click();
	    Thread.sleep(3000);
	    //snap
	    File screenshotAs=driver.getScreenshotAs(OutputType.FILE);
	    File dest=new File("./Output/redbus.png");
	    FileUtils.copyFile(screenshotAs, dest);
		 
		 
		 		
	   
		//Select dayDrop= new Select(Date);
	}

}
