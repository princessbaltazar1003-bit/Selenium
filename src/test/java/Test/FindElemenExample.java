package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElemenExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome", "chrome.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		WebElement Signup = driver.findElement(By.linkText("Create new account"));
		Signup.click();
		
		List<WebElement> days = driver.findElements(By.xpath("//select[@id='day']/option"));
        System.out.println("List of days:");
        for (WebElement day : days) {
            System.out.println(day.getText());
        }
        
		List<WebElement> months = driver.findElements(By.xpath("//select[@id='month']/option"));
        System.out.println("List of months:");
        for (WebElement month : months) {
            System.out.println(month.getText());
        }
		
        WebElement defaultYear = driver.findElement(By.xpath("//select[@id='year']/option[@selected='1']"));
        System.out.println("\nDefault selected year: " + defaultYear.getText());
	}

}
