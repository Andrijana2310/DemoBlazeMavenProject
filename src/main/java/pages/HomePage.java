package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    public WebDriver driver;

    public HomePage(ChromeDriver driver){
        this.driver = driver;
    }

    public WebElement buttonLogin(){
        return driver.findElement(By.xpath("//a[@id='login2']"));
    }

    public WebElement inputUserName(){
        return driver.findElement(By.xpath("//input[@id='loginusername']"));
    }

    public WebElement inputPassword(){
        return driver.findElement(By.xpath("//input[@id='loginpassword']"));
    }

    public void openPage(){
        driver.get("https://www.demoblaze.com/");
    }

    public void setUserName(String userName){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        inputUserName().sendKeys(userName);
    }
    public void setPassword(String password){
        inputPassword().sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();
    }

    public void close(){
        driver.close();
        driver.quit();
    }

    public void clickOnLogOut(){
        driver.findElement(By.xpath("//a[@id='logout2']"));
    }

    public boolean isPageLog(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement logoutButton = driver.findElement(By.xpath("//a[@id='logout2']"));
        String displayAtribut = logoutButton.getAttribute("style");
        if (displayAtribut.equals("display: block;")){

            return true;
        }
        else {
            return false;
        }
    }
}
