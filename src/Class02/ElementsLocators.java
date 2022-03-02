package Class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriverlatest.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();
        String webpagetitle=driver.getTitle();
        String Title=driver.getTitle();
        if(Title.equalsIgnoreCase(webpagetitle)){
System.out.println("Title is valid");

        }else{

            System.out.println("Title is not valid");

        }

driver.quit();

    }

}
