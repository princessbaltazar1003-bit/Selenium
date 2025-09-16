package Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsExample {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/browser-windows");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        // new tab
        WebElement newTab = driver.findElement(By.xpath("//button[text()='New Tab']"));
        newTab.click();

        List<String> allWin = new ArrayList<>(driver.getWindowHandles());

        String parent = allWin.get(0);
        String child = allWin.get(1);

        driver.switchTo().window(child);
        WebElement childHeader = driver.findElement(By.id("sampleHeading"));
        System.out.println("New Tab Text: " + childHeader.getText());

        driver.close();
        driver.switchTo().window(parent);

        //New window
        WebElement newWindow = driver.findElement(By.xpath("//button[text()='New Window']"));
        newWindow.click();

        List<String> allWin2 = new ArrayList<>(driver.getWindowHandles());

        String parent2 = allWin2.get(0);
        String child2 = allWin2.get(1);

        driver.switchTo().window(child2);
        WebElement childHeader2 = driver.findElement(By.id("sampleHeading"));
        System.out.println("New Window Text: " + childHeader2.getText());

        driver.close();
        driver.switchTo().window(parent2);

        driver.quit();
    }
}
