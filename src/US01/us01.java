package US01;

import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class us01 {
    public class us1 extends BaseDriverParameter {

        @Test
        public void TechnoTest() {
            driver.get("https://techno.study/tr/");

            WebElement TechnoLogo = driver.findElement(By.xpath("//a[@href='/tr']"));
            TechnoLogo.click();

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/tr']")));

            Assert.assertTrue(driver.getCurrentUrl().equals("https://techno.study/tr"));

        }
    }
}