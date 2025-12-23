package example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FlipkartDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("iphone 15 pro max");
        searchBox.submit();
        WebElement element1=driver.findElement(By.xpath("//div[text()='Apple iPhone 15 Pro Max (Blue Titanium, 1 TB)']"));
        element1.click();
        Thread.sleep(6000);
        String parent = driver.getWindowHandle();
        for (String win : driver.getWindowHandles()) {
            if (!win.equals(parent)) {
                driver.switchTo().window(win);
            }
        }
        driver.close();
        driver.switchTo().window(parent);
        WebElement search= driver.findElement(By.xpath("//input[@class='Vy9RSP']"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].value = '';", box);

         //  Using js or like below using keys

        search.click();
        search.sendKeys(Keys.CONTROL + "a");
        search.sendKeys(Keys.DELETE);
        search.sendKeys("Women watch");
        search.submit();





    }
}
