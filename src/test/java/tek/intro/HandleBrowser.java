package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowser {
    public static void main(String[] args) {
        //Open Browser => Chrome Browser
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://google.com");

    }
}
