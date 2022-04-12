package pages;

import com.nivelics.commons.methods.web.Method;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class Register extends Method {

    @FindBy(xpath = "//input[@id='text1']")
    private WebElement clickName;

    @FindBy(xpath = "//body[1]/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]" +
            "/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[2]")
    private WebElement clickLastName;

    @FindBy(xpath = "//body[1]/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]" +
            "/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[3]")
    private WebElement clickHidden;

    @FindBy(xpath = "//body[1]/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]" +
            "/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[5]")
    private WebElement clickHideBike;

    @FindBy(xpath = "//body[1]/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]" +
            "/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[6]")
    private WebElement clickHideCar;

    @FindBy(xpath = "//body[1]/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]" +
            "/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[8]")
    private WebElement clickMale;

    @FindBy(xpath = "//body[1]/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]" +
            "/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[10]")
    private WebElement clickFile;

    @FindBy(xpath = "//body[1]/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]" +
            "/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/select[1]/option[1]")
    private WebElement clickBox;

    @FindBy(xpath = "//select[@id='Carlist']")
    private WebElement selectBox;

    @FindBy(css = "car2")
    private WebElement optionDos;

    @FindBy(xpath = "//option[@id='country3']")
    private WebElement clickJapan;

    @FindBy(xpath = "//input[@value='->']")
    private WebElement clickIndicatorRight;

    @FindBy(xpath = "//body[1]/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]" +
            "/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
    private WebElement clickAlert;

    @FindBy(xpath = "//input[@id='submitButton']")
    private WebElement clickTable;

    String file = "C:\\Users\\JONATHAN\\Documents\\Nivelics\\fondos nivelics\\QA2.jpg";

    Select selectmenu = null;


    public Register registerTest() {
        WAIT_INTERFACE.waitForElementToClickeable(10, 2, clickName);
        SEN_KEYS_INTERFACE.sendKeys(clickName, "Hans");
        WAIT_INTERFACE.waitForElementToClickeable(18, 9, clickLastName);
        SEN_KEYS_INTERFACE.sendKeys(clickLastName, "Ballesteros");
        UTILS_INTERFACE.clickElement(clickHideBike);
        UTILS_INTERFACE.clickElement(clickHideCar);
        UTILS_INTERFACE.clickElement(clickMale);
        SEN_KEYS_INTERFACE.sendKeys(clickFile, file);
        UTILS_INTERFACE.clickElement(selectBox);
        selectmenu = new Select(selectBox);
        selectmenu.selectByValue("BMW Car");
        UTILS_INTERFACE.clickElement(clickJapan);
        UTILS_INTERFACE.clickElement(clickIndicatorRight);
        UTILS_INTERFACE.clickElement(clickAlert);
        try {
            webDriverFacade.getWebDriver().switchTo().alert().accept();
        } catch (UnhandledAlertException exception) {
            System.out.println(exception.getAlertText());
        }
        UTILS_INTERFACE.clickElement(clickTable);
        WAIT_INTERFACE.pause(3);
        return this;
    }

}
