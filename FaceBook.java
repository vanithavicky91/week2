package week2.day;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click on creat new account 
		driver.findElement(By.xpath("//div[@cass='_6ltg')])[2]/a")).click();
		driver.findElement(By.xpath("//div[@class='mbm _1iy_ _a4y _3-90 lfloat _ohe']//input")).sendKeys("Varnam");
       driver.findElement(By.xpath("//div[contains(text(),'Surname')/following::input")).sendKeys("Sri");
       driver.findElement(By.xpath("//div[contains(text(),'Mobile number or email address')]/following::input")).sendKeys("9629503861");
		driver.findElement(By.id("password_step_input")).sendKeys("Sri@2123456");
		//three dropdown
		WebElement day=driver.findElement(By.id("day"));
		Select dayDrop= new Select(day);
		dayDrop.selectByVisibleText("12");
		//drop month
		WebElement month= driver.findElement(By.id("month"));
		Select monthDrop= new Select(month);
		monthDrop.selectByVisibleText("Jan");
		//year
		WebElement year=driver.findElement(By.id("year"));
		Select yearDrop=new Select(year);
		yearDrop.selectByVisibleText("1990");
		//female radio buton
		driver.findElement(By.className("_8esa")).click();
		driver.findElement(By.xpath("//div[@class='_1lch']//button")).click();
	//	System.out.println("Successfuly loggedin");
	}

}
