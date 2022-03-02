package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximiseWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriverlatest.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
//        driver.manage().window().fullscreen();
        driver.navigate().to("https://google.com");
        driver.navigate().back();
//driver.quit();

    }
}
