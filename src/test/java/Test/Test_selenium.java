package Test;

import java.time.Duration;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_selenium {
	public static void main(String[] Args) {
		System.setProperty("webdriver.chrome", "chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.close();
//		//4. Set up the gecko driver location
//		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
//		
//		//5. Assign the instance of firefox
//		driver = new FirefoxDriver();
//		
//		//6. Launch the firefox
//		driver.get("https://www.google.com/");
		
	}
}
