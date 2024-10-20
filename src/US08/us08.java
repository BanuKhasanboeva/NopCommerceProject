package US08;

import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Utility.BaseDriver.driver;

public class us08 extends BaseDriverParameter {
    @Test
    public void TermsOfUse() {

        us08Elements elements = new us08Elements();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions action= new Actions(driver);

        // 6000 pixer aşağıya in
        js.executeScript("window.scrollBy(0, 6500);");
        // Bize ulaşın linkine tıklat

        action.click(elements.checkBox).build().perform();

        // Bize ulaşın sayfasında olduğunu doğrula

        Assert.assertTrue(elements.kullanimSartlari.isDisplayed());

    }
}
