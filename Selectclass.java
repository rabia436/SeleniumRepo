package week3assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {
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
		 WebElement industry=driver.findElement(By.name("industryEnumId"));
		 Select sel=new Select(industry);
		 sel.selectByIndex(3);
		 WebElement ownershipdrop=driver.findElement(By.className("ownershipEnumId"));
		 Select sel1=new Select(ownershipdrop);
		 sel1.selectByVisibleText("S-Corporation");
		 WebElement source=driver.findElement(By.id("dataSourceId"));
		 Select sel2=new Select(source);
		 sel2.selectByValue("Employee");
		 WebElement marketingcampaign=driver.findElement(By.id("marketingCampaignId"));
		 Select sel3=new Select(marketingcampaign);
		 sel3.selectByIndex(6);
		 WebElement statedd=driver.findElement(By.id("generalStateProvinceGeoId"));
		 Select sel4=new Select(statedd);
		 sel4.selectByValue("Texas");
		 driver.findElement(By.className("smallSubmit")).click();
		 driver.close();
	}
}
