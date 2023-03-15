package pages.Base.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.Constant.TimeoutVariable.EXPLICIT_WAIT;

/*Логика для всех страниц*/
public class BasePage {
    //Экземпляр драйвера
    protected WebDriver driver;
    //Конструктор
    public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }
// Метод для открытия страницы
    public void open(String url) {

        driver.get(url);
    }

    // Метод для ожидания видимости элемента
public WebElement waitElementIsVisible(WebElement element)
{
    new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.visibilityOf(element));
    return element;
}

}

