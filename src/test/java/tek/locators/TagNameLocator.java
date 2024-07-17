package tek.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagNameLocator {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com/");
        //method findElements return List<WebElement> contains all the elements find
        //with By strategy

        List<WebElement> anchorElements = driver.findElements(By.tagName("a"));
        int ancherElSize = anchorElements.size();
        System.out.println("Total Number of Tags: " + ancherElSize);
        //find how many image is in BBC

        List<WebElement> totalImages = driver.findElements(By.tagName("img"));
        int numberOfImages = totalImages.size();
        //print list of images
        for(WebElement element : totalImages){
            System.out.println(element.getText());
        }

    }
}
