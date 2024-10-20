package US08;

import Utility.BaseDriver;
import Utility.BaseDriverParameter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class us08Elements {
    public us08Elements() {
        PageFactory.initElements(BaseDriverParameter.driver,this);
    }

    @FindBy(xpath = "//label[contains(@class,'checkbox')]//span//a")
    public WebElement checkBox;

    @FindBy(xpath = "//div[@field='text']")
    public WebElement kullanimSartlari;


}
