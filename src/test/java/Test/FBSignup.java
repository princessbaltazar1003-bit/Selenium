package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome", "chrome.exe");
				//driver 
				WebDriver driver = new FirefoxDriver();
				driver.get("https://www.facebook.com/");
				
				driver.manage().window().maximize();
	
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				
				
				WebElement Signup = driver.findElement(By.linkText("Create new account"));
				Signup.click();
				
				WebElement Fname = driver.findElement(By.cssSelector("input[name=firstname]"));
				Fname.sendKeys("Arnel");
				
				WebElement Lname = driver.findElement(By.cssSelector("input[name=lastname]"));
				Lname.sendKeys("Belen");
				
				WebElement Date = driver.findElement(By.cssSelector("select#day"));
				Select ddDate = new Select(Date);
				ddDate.selectByVisibleText("14");
				
				WebElement Month = driver.findElement(By.cssSelector("select#month"));
				Select ddMonth = new Select(Month);
				ddMonth.selectByVisibleText("Sep");
				
				WebElement Year = driver.findElement(By.cssSelector("select#year"));
				Select ddYear = new Select(Year);
				ddYear.selectByVisibleText("1998");
				
				
				WebElement genderMale = driver.findElement(By.cssSelector("input[name='sex'][value='2']"));
				genderMale.click();
				
				WebElement emailOrMobile = driver.findElement(By.name("reg_email__"));
				emailOrMobile.sendKeys("johndoe123@gmail.com");

				WebElement password = driver.findElement(By.name("reg_passwd__"));
				password.sendKeys("StrongPassword123");
				
				WebElement signUpBtn = driver.findElement(By.name("websubmit"));
				signUpBtn.click();

				
	}
	
}
