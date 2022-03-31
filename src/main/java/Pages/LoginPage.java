package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    @FindBy(xpath = "//input[@id='email']") private WebElement userName;
    @FindBy(xpath = "//input[@id='pass']") private WebElement password;
    @FindBy(xpath = "//button[@name='login']") private WebElement loginBtn;

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void setUserName()
    {
        userName.sendKeys("abc@gmail.com");
    }

    public void setPassword()
    {
        password.sendKeys("12345678");
    }

    public void clickONBtn()
    {
        loginBtn.click();
    }

}
