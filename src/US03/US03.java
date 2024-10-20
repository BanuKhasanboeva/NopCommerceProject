package US03;

import Utility.BaseDriver;
import Utility.BaseDriverParameter;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class             US03 extends BaseDriverParameter {
    @Test(dataProvider = "getData")
    public void TC0301(String name, String mail, String phoneNumber, String age, String job) {
        Elements elements = new Elements();

        elements.apply.click();
        elements.nameAndSurname.sendKeys(name);
        elements.eMail.sendKeys(mail);
        elements.phoneNumber.sendKeys(phoneNumber);
        elements.age.sendKeys(age);
        elements.job.sendKeys(job);

        Select select = new Select(elements.education);

        Select select1 = new Select(elements.country);
        select1.selectByVisibleText("Algeria");

        Select select2 = new Select(elements.course);
        select2.selectByValue("Job Center & Arbeitsamt");

        Select select3 = new Select(elements.whereDidYouHearUs);
        select3.selectByValue("Instagram");

        elements.promotion.sendKeys("TestTeam");
        elements.ReadAndAccepted.click();
        elements.sent.click();
    }

    @DataProvider
    Object[][] getData() {
        Object[][] data = {{"Team9", "team@gmail.com", "5234567890", "24", "QA"}};
        return data;
    }
}