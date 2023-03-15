package testBase.InputTest;

import org.testng.annotations.Test;
import testBase.Base.BaseTest;

public class AutorizationTest extends BaseTest{
    @Test
    public void autorizationinbitrix() {
        basePage.open("https://testinfo203.russvet.ru/");
        autorization.
                autorizationbtr();
    }
}
