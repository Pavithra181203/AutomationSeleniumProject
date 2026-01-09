package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/r.php");
        driver.manage().window().maximize();
        Select day=new Select(driver.findElement(By.id("day")));
        day.selectByIndex(10);
        day.selectByValue("15");
        day.selectByVisibleText("20");

        System.out.println("Dropdown done");

    }
}
