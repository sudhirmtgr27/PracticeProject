package testPackage;

import BasePackage.baseClass;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testCase1 extends baseClass
{
    @BeforeMethod
    public void initializeBrowser()
    {
        browser();
    }

    @Test
    public void TC1()
    {
        LoginPage lp=new LoginPage(driver);
        lp.setUserName();
        lp.setPassword();
        lp.clickONBtn();
    }

    @Test
    public void TC2()
    {
        System.out.println("test case 2 is passed...");
    }


    @AfterMethod
    public void tearDown()
    {
        driver.close();
    }

}
