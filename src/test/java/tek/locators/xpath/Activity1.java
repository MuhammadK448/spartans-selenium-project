package tek.locators.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[text()='Video Games']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//p[text()='PlayStation 5 Console']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='addToCartBtn']")).click();


        driver.quit();
    }


}
