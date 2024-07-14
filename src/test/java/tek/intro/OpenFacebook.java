package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebook {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
    }
}
