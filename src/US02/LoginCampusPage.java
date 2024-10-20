package US02;

import Pages_US02_04_05.PageHome;
import Utility.BaseDriverParameter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginCampusPage extends BaseDriverParameter {
    @Test
    public void LoginCampusPage() {
        PageHome ph = new PageHome();

        ph.myClick(ph.campusLoginButton);
        wait.until(ExpectedConditions.urlToBe("https://campus.techno.study/"));
        Assert.assertTrue(driver.getCurrentUrl().equals("https://campus.techno.study/"));
    }
}
