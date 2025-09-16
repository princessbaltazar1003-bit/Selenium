package Test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyBoardEvent {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        // Locate search box using XPath
        WebElement searchBox = driver.findElement(By.xpath("//*[@title='Search']"));

        // Type the text
        searchBox.sendKeys("today is tuedasy");

        // Select all (CTRL + A) and then delete
        searchBox.sendKeys(Keys.chord(Keys.CONTROL, "a",Keys.DELETE));
        
        searchBox.sendKeys("what is tulog?");

//        driver.quit();
    }
}
