package test.RegisterTest;

import org.testng.annotations.Test;
import test.BaseTest;

public class SearchTest extends BaseTest {


    @Test
    public void search() {
        registerPage.clickSearchCreion();
        registerPage.clickSearchButton();
        registerPage.clickHome();
        registerPage.clickDreapta();
        registerPage.clickStangat();
        registerPage.clickCabluri();
        registerPage.clickEndoscop();
        registerPage.clickBack();
        registerPage.clickAccesorii();
    }
}
