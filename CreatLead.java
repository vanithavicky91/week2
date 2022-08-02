package week2.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
System.out.println("Successfuly loggedin");
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("varnam");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aadhi");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sri");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Amar");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
driver.findElement(By.id("createLeadForm_description")).sendKeys("excellent");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vanithavicky1991@gmail.com");
WebElement dropdown1=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select select=new Select(dropdown1);
select.selectByVisibleText("New York");
driver.findElement(By.className("smallSubmit")).click();
String title=driver.getTitle();
System.out.println("The title is: "+driver.getTitle());


	}

}
