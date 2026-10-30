


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Login {
    
    private WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String email, String password) {
        
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("password"));

        emailField.sendKeys(email);
        passwordField.sendKeys(password);

        WebElement loginButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));

        loginButton.click();

    }


}
