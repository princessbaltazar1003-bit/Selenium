package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/frames");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        
        driver.switchTo().frame("frame1");
        WebElement frames = driver.findElement(By.tagName("h1"));
        System.out.println("Frame 1 Text: " + frames.getText());
        
        driver.switchTo().defaultContent();
        
        driver.switchTo().frame("frame2");
        WebElement frame2Text = driver.findElement(By.tagName("h1"));
        System.out.println("Frame 2 Text: " + frame2Text.getText());

        driver.switchTo().defaultContent();
	}

}
