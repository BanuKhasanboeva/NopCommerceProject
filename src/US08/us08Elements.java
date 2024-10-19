package US08;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class us08Elements {
    public us08Elements() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//*[@style='line-height: 29px;']")
    public WebElement bizeUlasin;

    @FindBy(linkText = " okudum ve kabul ettim.")
    public WebElement okudumKabul;

    @FindBy(xpath = "//*[a='Kullanım Şartları']")
    public WebElement kullanimSartlari;


}
