package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriverlatest.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
     WebElement Usernamebox=driver.findElement(By.id("ctl00_MainContent_username"));
        Usernamebox.sendKeys("Tester");
        WebElement Passwordbox=driver.findElement(By.id("ctl00_MainContent_password"));
        Passwordbox.sendKeys("test");
        WebElement LoginBtn=driver.findElement(By.id("ctl00_MainContent_login_button"));
        LoginBtn.click();
        Thread.sleep(2000);

        String PageTitle=driver.getTitle();
        WebElement logoutbtn = driver.findElement(By.id("ctl00_logout"));
        logoutbtn.click();
        if(PageTitle.equalsIgnoreCase(PageTitle)){
            System.out.println("Page title is verified and valid");
        }else {
            System.out.println("Page title is not verified");


        }
        driver.close();
    }


}
