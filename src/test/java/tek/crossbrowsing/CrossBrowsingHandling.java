package tek.crossbrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class CrossBrowsingHandling {
    public static void main(String[] args) {

        WebDriver driver;
        System.out.println("Please choose a browser type to run your test");
        Scanner scan = new Scanner(System.in);
        String browser = scan.next();
        String browserType = browser;
        if(browserType.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if(browserType.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }else{
            throw new RuntimeException("Wrong Driver");
        }
        driver.manage().window().maximize();

        driver.get("https://google.com");

    }



}
