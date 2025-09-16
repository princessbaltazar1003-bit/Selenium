package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableExample {
    public static void main(String[] args) {

        System.setProperty("webdriver.driver", "geckodriver.exe"); // ✅ use correct driver for Firefox

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        // Find out total num of rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        System.out.println("Total num of rows: " + rows.size());

        // Find out total num of columns (from the header row <th>)
        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
        System.out.println("Total num of columns: " + cols.size());
        
//        System.out.println("First coulumn name is " + cols.get(0).getText());
//		System.out.println("Second coulumn name is " + cols.get(1).getText());
//		System.out.println("Third coulumn name is " + cols.get(2).getText());
        

      //using for loop print the column names
      		for (int i=0;i<cols.size();i++) {
      			System.out.println("Column name is " + cols.get(i).getText());
      		}
      		
      		// using for each loop
      		
      		for(WebElement col:cols) {
      			System.out.println(col.getText());
      		}

      		// Find the country for the given company
      		String Company = "Island Trading";
      		WebElement CountryName = driver.findElement(By.xpath("//td[text()='Island Trading']/following-sibling::td[2]"));
      		System.out.println("Country name is " + CountryName.getText());

            driver.quit();
    }
}
