package tek.review.week1;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        Thread.sleep(3000);
        driver.get("https://retail.tekschool-students.com/");

        String emailPrefix = "khusravi_m";
        int number = (int) (Math.random() * 1000);
        String email = emailPrefix + number + "@gmail.com";

        driver.findElement(By.id("signinLink")).click();
        driver.findElement(By.id("newAccountBtn")).click();
        driver.findElement(By.id("nameInput")).sendKeys("Khusravi");
        driver.findElement(By.id("emailInput")).sendKeys(email);
        driver.findElement(By.id("passwordInput")).sendKeys("Pass@123");
        driver.findElement(By.id("confirmPasswordInput")).sendKeys("Pass@123");
        driver.findElement(By.id("signupBtn")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.id("profileImage")).isDisplayed());
//        boolean isProfilePicDisplayed = driver.findElement(By.id("profileImage")).isDisplayed();
//        Assert.isTrue(isProfilePicDisplayed, "Profile image is not displayed");

        Thread.sleep(5000);
        driver.quit();
    }
}
