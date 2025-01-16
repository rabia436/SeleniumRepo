package week3assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

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
		 WebElement accounts=driver.findElement(By.linkText("Accounts"));
		 accounts.click();
		 WebElement create_account=driver.findElement(By.linkText("Create Account"));
		 create_account.click();
		 driver.findElement(By.id("accountName")).sendKeys("Sherin");
		 driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		 driver.findElement(By.id("numberEmployees")).sendKeys("4");
		 driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		 WebElement button=driver.findElement(By.className("smallSubmit"));
		 button.click();
		 System.out.println(driver.getTitle());
		 driver.close();
		
		

	}

}
