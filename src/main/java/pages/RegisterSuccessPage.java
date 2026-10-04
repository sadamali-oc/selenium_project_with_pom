package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterSuccessPage {

    WebDriver driver;

    public RegisterSuccessPage(WebDriver driver){
        this.driver=driver;
    }



    By successMsg = By.xpath("//b[contains(text(),'Dear')]");

    public String  clickSuccessMessage(){
       String successText =  driver.findElement(successMsg).getText();
       return  successText;
    }


}
