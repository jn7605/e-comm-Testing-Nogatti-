
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class moveToLogin {
    
    private WebDriver driver;

    public moveToLogin(WebDriver driver) {
        this.driver = driver;
    }

    public void moveToLoginPage() {
    
        driver.findElement(By.linkText("Go Home")).click();

        WebElement SignInButton = driver.findElement(By.linkText("Sign In"));
        SignInButton.click();

    }

}