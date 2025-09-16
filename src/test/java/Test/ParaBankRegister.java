package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParaBankRegister {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome", "chrome.exe");
				
				WebDriver driver = new FirefoxDriver();
				driver.get("https://parabank.parasoft.com/parabank/index.htm");
				
				driver.manage().window().maximize();
	
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				
				 // Click the Register link	
		        WebElement registerLink = driver.findElement(By.xpath("//a[text()='Register']"));
		        registerLink.click();

		        // Fill in registration form with sample data
		        driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Arnel");
		        driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Belen");
		        driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("Secret");
		        driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Manila");
		        driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Metro Manila");
		        driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("143");
		        driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("09171234567");
		        driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("12356789");

		        String username = "admin";
		        driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(username);
		        driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("admin123");
		        driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("admin123");

		        // Submit the register form
//		        driver.findElement(By.xpath("//input[@value='Register']")).click();
		       
		        
	}
	
}
