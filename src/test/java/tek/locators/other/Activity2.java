package tek.locators.other;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://www.google.com/");

       WebElement searchBar =  driver.findElement(By.name("q"));
       searchBar.sendKeys("TekSchool");
       searchBar.sendKeys(Keys.ENTER);
       driver.findElement(By.xpath("//h3[contains(text(),'TEK SCHOOL')]")).click();

    }
}
