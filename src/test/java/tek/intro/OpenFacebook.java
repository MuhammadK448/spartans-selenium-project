package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebook {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");

        System.out.println(driver.getTitle());

        //Thread.Sleep(3000);
        driver.close();
    }
}
