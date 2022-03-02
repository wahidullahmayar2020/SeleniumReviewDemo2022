package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriverlatest.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
//        driver.quit();
driver.close();


    }
}
