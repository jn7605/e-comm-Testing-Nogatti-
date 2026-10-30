
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class postAd {

    private WebDriver driver;

    public postAd(WebDriver driver) {
        this.driver = driver;
    }

    public void moveToPostAdPage() {
        WebElement postAdButton = driver.findElement(By.xpath("(//a[@href=\"/post-ad\"])[2]"));
        postAdButton.click();
    }

    public void itemDetails(){

        WebElement titleName = driver.findElement(By.id("title"));
        WebElement description = driver.findElement(By.id("description"));

        titleName.sendKeys("Sample Item");
        description.sendKeys("This is a sample item description.");


    }

    public void pricingCategory(){

        WebElement price = driver.findElement(By.id("price"));

        price.sendKeys("100");
        
        System.out.println("Selecting category from dropdown");
        WebElement categoryDropdown = driver.findElement(
                By.xpath("//button[@role='combobox' and .//*[normalize-space()='Select a category']]"));
        categoryDropdown.click();

        WebElement electronicsOption = driver.findElement(
                By.xpath("//*[@role='option' and normalize-space()='Other Electronics']"));
        electronicsOption.click();
    }

    public void images(){

    }
}
