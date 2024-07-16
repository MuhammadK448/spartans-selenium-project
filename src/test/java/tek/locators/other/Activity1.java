package tek.locators.other;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://retail.tekschool-students.com/");
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("newAccountBtn")).click();
        driver.findElement(By.name("name")).sendKeys("Khusravi");
        driver.findElement(By.id("emailInput")).sendKeys("MKhusravi3214@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pass@3421");
        driver.findElement(By.name("confirmPassword")).sendKeys("Pass@3421");
        driver.findElement(By.className("signup__btn")).click();

    }
}
