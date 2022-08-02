package week2.day;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='home']")).click();
		driver.findElement(By.xpath("//h5[text()='Button']/parent::a")).click();
		System.out.println("Position of the button is"+ driver.findElement(By.id("position")).getLocation());
		String buttonColor=driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("Color of the Button is" +buttonColor);
		System.out.println("Height and Width of the button is" +driver.findElement(By.id("size")).getSize());
		
	}

}
