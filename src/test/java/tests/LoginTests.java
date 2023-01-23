package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginTests {

    @Test
    public void verifyLogin(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ana\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        HomePage loginPage = new HomePage(driver);
        loginPage.openPage();
        loginPage.buttonLogin().click();
        loginPage.setUserName("test");
        loginPage.setPassword("test");
        loginPage.clickLogin();

        Assert.assertEquals (loginPage.isPageLog(), true);
        //loginPage.clickOnLogOut();
        loginPage.close();



        System.out.println("Login successful");
        System.out.println("Login successful");


    }
}
