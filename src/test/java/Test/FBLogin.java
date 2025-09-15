package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome", "chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        
        // Locate email input
        WebElement emailInput = driver.findElement(By.id("email"));
        // Locate password input
        WebElement passInput = driver.findElement(By.id("pass"));
        // Locate login button
        WebElement loginBtn = driver.findElement(By.name("login"));

        // Enter dummy credentials
        emailInput.sendKeys("dummy_email@example.com");
        passInput.sendKeys("DummyPassword123");

        // Click login
        loginBtn.click();

        // Wait a few seconds so you can see result before quit
        try { 
        	Thread.sleep(5000); 
        	} 
        catch (InterruptedException e) {
        	e.printStackTrace(); 
        	}

        driver.quit();
		
	}
}
