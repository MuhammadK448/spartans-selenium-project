package tek.locators.id;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://retail.tekschool-students.com/");
        driver.findElement(By.id("signinLink")).click();
        driver.findElement(By.id("email")).sendKeys("Khusravi@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Pass123");
        driver.findElement(By.id("loginBtn")).click();
        Thread.sleep(3000);
        driver.quit();


    }
}
