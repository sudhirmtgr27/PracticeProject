package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleTestCase
{
    @Test
    public void TC5()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Softwares\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        WebElement username1=driver.findElement(By.xpath("//input[@id='email']"));
        WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
        WebElement btn1=driver.findElement(By.xpath("//button[@name='login']"));

        username1.sendKeys("abc@gmail.com");
        password.sendKeys("qable@123");
        btn1.click();

    }


}

