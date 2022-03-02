package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriverlatest.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com");
         WebElement Username=driver.findElement(By.id("email"));
WebElement Password=driver.findElement(By.id("pass"));
        Username.sendKeys("mjmayar");
        Password.sendKeys("arshjan");
        WebElement Login=driver.findElement(By.name("login"));
        Thread.sleep(2000);
        Login.click();
        Thread.sleep(2000);
//        WebElement Forgotpassord=driver.findElement(By.linkText("Forgot password?"));
//        Forgotpassord.click();
        WebElement ForgotPassword=driver.findElement(By.partialLinkText("Forgot"));
        ForgotPassword.click();
        driver.quit();
    }
}
