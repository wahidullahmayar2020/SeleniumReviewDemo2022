package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers\\chromedriverlatest.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String PageTitle=driver.getTitle();
        String PageUrl=driver.getCurrentUrl();
        System.out.println(PageUrl+" "+PageTitle);
        driver.quit();
    }
}
