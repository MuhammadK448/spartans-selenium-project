package tek.locators.id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLocator {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        Thread.sleep(3000);

        //Find the locateer
        By searchInputLocator = By.id("searchInput");
        //locate the element
        WebElement searchInputElement = driver.findElement(searchInputLocator);
        //Perform action
        searchInputElement.sendKeys("TV");

        By searButtonLocator = By.id("searchBtn");
        WebElement searchButtonElement = driver.findElement(searButtonLocator);
        Thread.sleep(2000);
        searchButtonElement.click();



    }
}
