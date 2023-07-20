package test.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.sleep;


public class RegisterTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);


    @Test
    public void register() {

        sleep(2000);
        registerPage.clickAcceptButton();
        sleep(2000);
        registerPage.clickAutentificareButton();
        sleep(2000);
        LOG.info("Click Creaza cont button");
        registerPage.creazaCont();
        sleep(2000);
        registerPage.clickModAdresareButton();
        sleep(2000);
        registerPage.setPrenume();
        registerPage.setNume();
        registerPage.setEmail();
        registerPage.setPassword();
        registerPage.clickGdpr();
        registerPage.clickAmCont();
        registerPage.clickEmailLog();
        registerPage.clickLoginPass();
        registerPage.clickConfirmare();
    }
}
