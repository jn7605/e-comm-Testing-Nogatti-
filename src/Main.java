
//All implemented are started. Drive from here.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;

class Main{

    public static void main(String[] args){
        
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        moveToLogin moveToLoginOBJ = new moveToLogin(driver);

        driver.get("https://buyorsell-fe.vercel.app/");

        moveToLoginOBJ.moveToLoginPage();


        postAd postAdOBJ = new postAd(driver);
        
        Login loginOBJ = new Login(driver);
        loginOBJ.login("ramsith@example.com", "P@ssw0rd123!");

        postAdOBJ.moveToPostAdPage();
        postAdOBJ.itemDetails();
        postAdOBJ.pricingCategory();
        postAdOBJ.images();

    }

}
