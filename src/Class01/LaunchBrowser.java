package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver123.exe");
        WebDriver driver=new ChromeDriver();  //launch the browser
        driver.get("https://www.syntaxtechs.com/");//navigates to the url
       String Url=driver.getCurrentUrl();
       System.out.println(Url);
        String PageTitle=driver.getTitle();//getting the title of a page
        System.out.println(PageTitle);
        driver.quit();






    }
}
