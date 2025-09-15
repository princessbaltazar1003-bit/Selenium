package Test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwabLabLogin {
    public static void main(String[] args) {
        // Path to ChromeDriver
        System.setProperty("webdriver.driver", "chrome.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        // Open the site
        driver.get("https://www.saucedemo.com/");

        // Test data
        String usernameData = "standard_user";
        String passwordData = "secret_sauce";

        // Declare WebElements
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));

        // Perform login
        username.sendKeys(usernameData);
        password.sendKeys(passwordData);
        loginBtn.click();

     // Verification
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("inventory.html")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }

        // Pause for 3 seconds before closing
        try {
            Thread.sleep(3000);  // 3000 ms = 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close browser
        driver.quit();

    }
}
