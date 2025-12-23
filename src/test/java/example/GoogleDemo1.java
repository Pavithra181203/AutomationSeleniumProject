package example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDemo1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
        WebElement search=driver.findElement(By.name("q"));
        search.sendKeys("Selenium tutorial for beginners");
        search.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        WebElement link = driver.findElement(By.cssSelector("#r1-8 > div.ikg2IXiCD14iVX7AdZo1 > h2 > a > span"));
        link.click();
        ((JavascriptExecutor) driver).executeScript("arguments[100].scrollIntoView(true);", link);
        Thread.sleep(3000);
    }
}
