package example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        TakesScreenshot ts=(TakesScreenshot) driver;
        File source=ts.getScreenshotAs(OutputType.FILE);

        File destination=new File("C:\\Screenshots\\google.png");
        FileUtils.copyFile(source,destination);
        System.out.println("Screenshot taken successfully");

    }
}
