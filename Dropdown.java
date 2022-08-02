package week2.day;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		//select prog
		WebElement dropdown=driver.findElement(By.id("dropdown1"));
		Select select=new Select(dropdown);
		select.selectByIndex(1);
		Thread.sleep(3000);
		WebElement dropdown2=driver.findElement(By.name("dropdown2"));
		select.selectByVisibleText("Loadrunner");
		WebElement dropdown3=driver.findElement(By.id("dropdown3"));
		select.selectByValue("2");
		Thread.sleep(3000);
		WebElement dropdown4=driver.findElement(By.className("dropdown"));
		Thread.sleep(3000);
		//secet by key
		driver.findElement(By.xpath("//div[@class='example'][5]/select")).sendKeys("Appium");
		Thread.sleep(3000);
		//multi selct
		WebElement value1=driver.findElement(By.xpath("(//option[text()='Selenium'])[6]"));
		WebElement value2=driver.findElement(By.xpath("(//option[text()='Appium'])[6]"));
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).click(value1).click(value2).build().perform();
		
		Thread.sleep(3000);
		//close
		driver.quit();
	
	}

}
