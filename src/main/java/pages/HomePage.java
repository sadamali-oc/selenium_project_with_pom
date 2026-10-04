package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    //constructors
    public  HomePage(WebDriver driver){
        this.driver = driver;
    }

    By registerButtonLocator= By.linkText("REGISTER");


    public  void selectRegisterMenu(){
        driver.findElement(registerButtonLocator).click();

    }
}
