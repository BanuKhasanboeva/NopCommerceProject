package US03;

import Utility.BaseDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class US03 extends BaseDriver {
    @Test(dataProvider = "getData")
    public void TC0301(String name, String mail, String phoneNumber, String age, String job) {
        POM pom = new POM();

        pom.apply.click();
        pom.nameAndSurname.sendKeys(name);
        pom.eMail.sendKeys(mail);
        pom.phoneNumber.sendKeys(phoneNumber);
        pom.age.sendKeys(age);
        pom.job.sendKeys(job);

        Select select = new Select(pom.education);

        Select select1 = new Select(pom.country);
        select1.selectByVisibleText("Algeria");

        Select select2 = new Select(pom.course);
        select2.selectByValue("Job Center & Arbeitsamt");

        Select select3 = new Select(pom.whereDidYouHearUs);
        select3.selectByValue("Instagram");

        pom.promotion.sendKeys("TestTeam");
        pom.ReadAndAccepted.click();
        pom.sent.click();
    }

    @DataProvider
    Object[][] getData() {
        Object[][] data = {{"Team9", "team@gmail.com", "5234567890", "24", "QA"}};
        return data;
    }
}