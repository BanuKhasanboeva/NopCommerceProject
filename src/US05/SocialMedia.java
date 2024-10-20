package US05;

import Pages_US02_04_05.PageHome;
import Utility.BaseDriverParameter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SocialMedia extends BaseDriverParameter {
    @Test
    public void SocialMedia() {
        PageHome ph = new PageHome();


        for (int i = 0; i < ph.socialMediaItems.size(); i++) {
            ph.scrolltoElement(ph.socialMediaItems.get(i));
            ph.socialMediaItems.get(i).click();

            Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains("techno"));
            driver.navigate().back();
        }
    }
}
