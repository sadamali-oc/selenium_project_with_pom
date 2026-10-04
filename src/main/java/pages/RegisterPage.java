package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver){
        this.driver=driver;
    }



    By firstNameField = By.xpath("//input[@name='firstName']");
    By lastNameField = By.xpath("//input[@name='lastName']");
    By countryDropdown = By.xpath("//select[@name='country']");
    By emailField = By.xpath("//input[@id='email']");
    By passwordField = By.xpath("//input[@name='password']");
    By confirmPasswordField = By.xpath("//input[@name='confirmPassword']");
    By submitButton = By.xpath("//input[@name='submit']");

    public void setFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    







}
