package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Date;

public class SampleExample {
    @Test
    public void verifyRegisterWithMandatoryFields(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.name("firstname")).sendKeys("Pavi");
        driver.findElement(By.name("lastname")).sendKeys("Ramesh");
        driver.findElement(By.name("email")).sendKeys(generateNewEmail());
        driver.findElement(By.name("telephone")).sendKeys("9629405954");
        driver.findElement(By.name("password")).sendKeys("Pavithra1812#");
        driver.findElement(By.name("confirm")).sendKeys("Pavithra1812#");
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
        String expectedResult="Your Account Has Been Created!";
        Assert.assertEquals(expectedResult, driver.findElement(By.xpath("//div[@id='common-success']//h1")).getText());

        String actualProperDetailOne="Congratulations! Your new account has been successfully created!";
        String actualProperDetailTwo="You can now take advantage of member privileges to enhance your online shopping experience with us.";
        String actualProperDetailThree="If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
        String actualProperDetailFour="A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please contact us.";

        String expectedProperDetails=driver.findElement(By.id("content")).getText();
        Assert.assertTrue(expectedProperDetails.contains(actualProperDetailOne));
        Assert.assertTrue(expectedProperDetails.contains(actualProperDetailTwo));
        Assert.assertTrue(expectedProperDetails.contains(actualProperDetailThree));
        Assert.assertTrue(expectedProperDetails.contains(actualProperDetailFour));
        driver.findElement(By.xpath("//a[text()='Continue']")).click();
        Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());

    }

    public String generateNewEmail(){
        return new Date().toString().replaceAll("\\s","").replaceAll("\\:","")+"@gmail.com";
    }
}
