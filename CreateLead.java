package week3assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		WebElement login=driver.findElement(By.className("decorativeSubmit"));
		login.click();
		 WebElement link=driver.findElement(By.linkText("CRM/SFA"));
		 link.click();
		 WebElement lead=driver.findElement(By.linkText("Leads"));
		 lead.click();
		 WebElement createlead=driver.findElement(By.linkText("Create Lead"));
		 createlead.click();
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aparna");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Das");
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Phonepe");
		 driver.findElement(By.name("generalProfTitle")).sendKeys("Test Analyst");
		 String expectedtitle="Create Lead|opentaps CRM ";
		 String actualtitle=driver.getTitle();
		 if(actualtitle.equals(expectedtitle)){
			 
			 System.out.println("Title verification success");
		 }
		 else
		 {
			 System.out.println("Title verification failed");
		 }
		 
	}

}
