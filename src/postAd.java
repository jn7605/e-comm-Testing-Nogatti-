
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
        WebElement categoryDropdown = driver.findElement(By.id("category"));

        price.sendKeys("100");
        
        //Use " Select" class to select category from dropdown
        Select categorySelect = new Select(categoryDropdown);
        categorySelect.selectByValue("Electronics");
    }

    public void images(){

    }
}
