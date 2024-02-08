package Ecommerce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"Email\"]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("admin@yourstore.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"Password\"]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"Password\"]")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Thread.sleep(1000);
	   driver.findElement(By.xpath("(//i[@class=\"right fas fa-angle-left \"])[1]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[@class=\"nav-item\"])[7]")).click();
		driver.findElement(By.xpath("//input[@id=\"SearchProductName\"]")).sendKeys("Apple MacBook Pro 13-inch");
		
		Thread.sleep(1000);
		driver.findElement(By.name("SearchCategoryId")).click();
		WebElement dd = driver.findElement(By.name("SearchCategoryId"));
		
		List<WebElement> value = driver.findElements(By.tagName("option"));
		
		for(int s=0; s<value.size(); s++) {
			
			String text = value.get(s).getText();
			
			System.out.println(text);
		}
		
		driver.findElement(By.xpath("(//option[@value=\"2\"])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class=\"check-box\"])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//option[@value=\"1\"])[2]")).click();
	    Thread.sleep(1000);
		driver.findElement(By.xpath("(//option[@value=\"1\"])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//option[@value=\"2\"])[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//option[@value=\"10\"])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//option[@value=\"1\"])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name=\"GoDirectlyToSku\"])")).sendKeys("AP_MBP_13");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[6]")).click();
		

		
		

		
		
	}

}
