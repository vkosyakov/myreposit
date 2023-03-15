package testBase.InputTest;

import org.testng.annotations.Test;
import testBase.Base.BaseTest;

public class DealsTest extends BaseTest {
@Test
public void dealstests()
{
    basePage.open("https://testinfo203.russvet.ru/");
    autorization.
            autorizationbtr();
    mainpage.
            inputcrm();
    deals.opendeals();
            //.adddeals()
            //.createdeals();


}


}
