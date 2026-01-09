package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExample {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys("pavitra1311@gmail.com");
    }
}
