package US04;

import Pages_US02_04_05_06.PageHome;
import Utility.BaseDriverParameter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class SubMenu extends BaseDriverParameter {
    @Test
    public void SubMenu() {
        PageHome ph = new PageHome();

        actions.moveToElement(ph.dropdownMenu).build().perform();

        for (int i = 0; i < ph.dropdownItems.size(); i++) {
            ph.dropdownItems.get(i).click();
            wait.until(ExpectedConditions.visibilityOf(ph.campusLoginButton));
            System.out.println((i+1)+"URL-" +driver.getCurrentUrl());
            driver.navigate().back();
            wait.until(ExpectedConditions.visibilityOf(ph.dropdownMenu));
            actions.moveToElement(ph.dropdownMenu).build().perform();
        }
    }
}
