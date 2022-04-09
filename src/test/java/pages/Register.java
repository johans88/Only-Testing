package pages;

import com.nivelics.commons.methods.web.Method;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register extends Method {

    @FindBy(xpath = "//input[@id='text1']")
    private WebElement clickName;

    @FindBy(xpath = "//body[1]/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]" +
            "/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[2]")
    private WebElement clickLastName;

    public Register registerTest() {
        WAIT_INTERFACE.waitForElementToClickeable(10, 2, clickName);
        SEN_KEYS_INTERFACE.sendKeys(clickName, "Hans");
        WAIT_INTERFACE.waitForElementToClickeable(18, 9, clickLastName);
        SEN_KEYS_INTERFACE.sendKeys(clickLastName, "Ballesteros");
        WAIT_INTERFACE.pause(3);


        return this;
    }
}
