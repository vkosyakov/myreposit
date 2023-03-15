package common;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static common.Config.PLATFORM_AND_BRAUSER;
import static constants.Constant.TimeoutVariable.IMPLICIT_WAIT;

// Класс для запускуа браузера */
public class CommonActions {

    public static WebDriver creatDriver()
    {
WebDriver driver = null;
switch (PLATFORM_AND_BRAUSER) {
    case "win_chrome":
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        break;
        /*По умолчанию*/
    default:
        Assert.fail("Incorrect platform or browser name: " + PLATFORM_AND_BRAUSER);
}
/*Установка параметров*/
        driver.manage().window().maximize(); /*Максимальное окно*/
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS); /*Ожижание*/
        return driver;

    }
}
