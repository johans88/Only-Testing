package pages;

import com.nivelics.commons.methods.web.Method;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class Table extends Method {

    @FindBy(xpath = "//body[1]/div[1]/div[1]/main[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]")
    private WebElement clickTable;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/main[1]/h1[1]")
    private WebElement title;


    public Table listTable() {
        SoftAssert name = new SoftAssert();
        Assert.assertTrue(WAIT_INTERFACE.textPresentInElement(12, 4, title, "hans" ),
                "El titulo esta bien");
        for (int i = 1; i <= 3; i++) {
            name.assertEquals(webDriverFacade.getWebDriver().findElement(
                    By.xpath("//body[1]/div[1]/div[1]/main[1]/div[2]/table[1]/tbody[1]/tr[1]/td[" + i + "]")
            ).getText(),"Mark", "softassert"+i);
//            Assert.assertEquals(webDriverFacade.getWebDriver().findElement(
//                    By.xpath("//body[1]/div[1]/div[1]/main[1]/div[2]/table[1]/tbody[1]/tr[1]/td[" + i + "]")
//            ).getText(), "Otto");
            System.out.println(webDriverFacade.getWebDriver().findElement(
                    By.xpath("//body[1]/div[1]/div[1]/main[1]/div[2]/table[1]/tbody[1]/tr[1]/td[" + i + "]")
            ).getText());
            WAIT_INTERFACE.pause(3);
        }
        name.assertAll();
        return this;
    }
}
