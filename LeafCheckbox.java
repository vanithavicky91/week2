package week2.day;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(3000);
		boolean isSelected=driver.findElement(By.xpath("//div[@class='example'][2]")).isSelected();
		if(isSelected) {
			System.out.println("chec kbox selected");
		}
		else {
			System.out.println("check box not selected");
		}
		Thread.sleep(3000);
		//clic all
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input")).click();
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[2]")).click();
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[3]")).click();
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[4]")).click();
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[5]")).click();
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[6]")).click();
	//	driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input")).click();
		//close browser
		driver.quit();
		}

}
