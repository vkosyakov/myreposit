package pages.Base.CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Base.Base.BasePage;

import static common.Config.LID_EMAIL;
import static common.Config.NAME_LID;

public class CreateLid extends BasePage {
    public CreateLid(WebDriver driver) {
        super(driver);
    }

    private final By iFrame = By.xpath("//iframe[@src=\"/crm/lead/details/0/?IFRAME=Y&IFRAME_TYPE=SIDE_SLIDER\"]");

    private final By NumberLid = By.xpath("//input[@placeholder=\"Лид #\"]");
    private final By Email = By.xpath("//input[@name='EMAIL[n0][VALUE]']");
    private final By Status = By.xpath("//div[@class=\"ui-ctl-element\"][text()='Не обработан']");

    private final By StatusInJob = By.xpath("///span[@class='menu-popup-item-text'][text()='В работе']");
    private final By BtnSave = By.xpath("//button[text()=\"Сохранить\"]");

    public CreateLid MethodcreateLid(){
        WebElement iframe = driver.findElement(iFrame);
        driver.switchTo().frame(iframe);
        driver.findElement(NumberLid).click();
        driver.findElement(NumberLid).sendKeys(NAME_LID);
        driver.findElement(Email).sendKeys(LID_EMAIL);
        driver.findElement(Status).click();
        driver.findElement(StatusInJob).click();
        driver.findElement(BtnSave).click();
        return this;
    }








}
