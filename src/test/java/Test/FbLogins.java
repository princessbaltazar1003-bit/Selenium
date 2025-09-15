package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FbLogins {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome", "chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		// 4. LinkText
		
		//WebElement ForgotPwd = driver.findElement(By.linkText("Forgotten password?"));
		//ForgotPwd.click();
		
		//5. Partial LinkText
		
//		WebElement ForgotPwdNew = driver.findElement(By.linkText("Forgotten"));
//		ForgotPwdNew.click();
        
        WebElement Header = driver.findElement(By.tagName("H2"));
        System.out.println(Header.getText());

	}

}

