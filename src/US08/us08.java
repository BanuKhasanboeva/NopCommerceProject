package US08;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import static Utility.BaseDriver.driver;

public class us08 {
    @Test
    public void TermsOfUse() {

        us08Elements elements = new us08Elements();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 2000);");

        elements.bizeUlasin.click();
        elements.okudumKabul.click();
        elements.kullanimSartlari.click();

    }
}
