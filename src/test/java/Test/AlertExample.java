package Test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertExample {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/alerts");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Simple Alert
        WebElement button1 = driver.findElement(By.id("alertButton"));
        js.executeScript("arguments[0].scrollIntoView(true);", button1);
        button1.click();
        Alert alt1 = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println("Simple Alert text: " + alt1.getText());
        alt1.accept();

        //Confirmation Alert 
        WebElement button3 = driver.findElement(By.id("confirmButton"));
        js.executeScript("arguments[0].scrollIntoView(true);", button3);
        button3.click();
        Alert alt3 = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println("Confirm Alert text: " + alt3.getText());
        alt3.dismiss(); // you can also use alt3.accept()

       

        driver.quit();
    }
}
