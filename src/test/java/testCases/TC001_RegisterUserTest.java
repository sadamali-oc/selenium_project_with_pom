package testCases;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import pages.RegisterSuccessPage;

import java.time.Duration;


public class TC001_RegisterUserTest {

     WebDriver driver;

     @BeforeMethod
     public  void openPage (){

         driver = new ChromeDriver();
//         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://demo.guru99.com/test/newtours/index.php");
     }


     @Test
    public void TC001(){

         HomePage homePage = new HomePage(driver);
         homePage.selectRegisterMenu();

         RegisterPage  registerPage = new RegisterPage(driver);
         registerPage.setFirstName("chamalka");
         registerPage.setLastName("selenium");
         registerPage.setEmail("chamalka@gmail.com");
         registerPage.setCountry();
         registerPage.setPassword("chamalka");
         registerPage.setConfirmPassword("chamalka");
         registerPage.clickSubmitButton();

         RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage(driver);
         String actualText = registerSuccessPage.clickSuccessMessage();
         Assert.assertTrue(actualText.contains("Dear"), "Registration attempts fail");



     }


     @AfterMethod
    public  void closeBrowser(){
//         driver.quit();
     }







}
