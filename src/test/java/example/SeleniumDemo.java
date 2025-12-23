package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); // Selenium 4+ auto-manages driver for modern setups
        driver.get("https://www.google.com");
        System.out.println("Title = " + driver.getTitle());
    }
}
