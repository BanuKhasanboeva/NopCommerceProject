package US03;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
    public POM() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(css = "[class='tn-atom js-click-zero-stat']")
    public WebElement apply;

    @FindBy(css = "[aria-label='name']")
    public WebElement nameAndSurname;

    @FindBy(name = "email")
    public WebElement eMail;

    @FindBy(id = "input_1661174990146")
    public WebElement phoneNumber;

    @FindBy(css = "[name='Input']")
    public WebElement age;

    @FindBy(css = "[name='Input_2']")
    public WebElement job;

    @FindBy(css = "[id='sb-1667664755026']")
    public WebElement education;

    @FindBy(css = "[name='country_2']")
    public WebElement country;

    @FindBy(css = "[name='course']")
    public WebElement course;

    @FindBy(css = "[name='survey']")
    public WebElement whereDidYouHearUs;

    @FindBy(css = "[name='promo code']")
    public WebElement promotion;

    @FindBy(xpath = "(//a[@href='https://techno.study/tr/terms'])[1]")
    public WebElement ReadAndAccepted;

    @FindBy(css = "[class='t-submit']")
    public WebElement sent;
}
