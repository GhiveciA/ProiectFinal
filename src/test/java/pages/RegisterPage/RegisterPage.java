package pages.RegisterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private RegisterPage() {
    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }


    public By accept = By.xpath("//*[@id=\"cookieMessage\"]/div/a");
    public By autentificare = By.cssSelector("#header > div > div.main-header.clearfix > div > div > div.header-right > div > div.customer-signin-module > div > div > ul > li > div > a > span");
    public By creeazaCont = By.cssSelector("#main > div.page-footer > div > a");
    public By modAdresare = By.cssSelector("#field-id_gender-1");
    public By prenume = By.cssSelector("#field-firstname");
    public By nume = By.cssSelector("#field-lastname");
    public By email = By.cssSelector("#field-email");
    public By password = By.cssSelector("#field-password");
    public By gdpr = By.cssSelector("#customer-form > div:nth-child(1) > div.form-group.row.psgdpr > div > label > span.check-wrap > input[type=checkbox]");
    public By amcont = By.cssSelector("#main > div.page-footer > div > a");
    public By emailLog = By.cssSelector("#field-email");
    public By loginPass = By.cssSelector("#field-password");
    public By confirmare = By.cssSelector("#submit-login");
    public By search1 = By.cssSelector("#search_widget > div > form > button > i");
    public By searchCreion = By.cssSelector("#search_widget > div > form > input.form-control.ui-autocomplete-input");
    public By home1 = By.cssSelector("#header > div > div.main-header.clearfix > div > div > div.header-logo > a > img");
    public By dreapta = By.cssSelector("#aSlick3 > button.slick-next.slick-arrow");
    public By stanga = By.cssSelector("#aSlick3 > button.slick-prev.slick-arrow");
    public By cabluri = By.cssSelector("#left-column > div > div.left-categories.column-block.md-bottom > div > ul > li:nth-child(15) > a > span");
    public By endoscop = By.cssSelector("#js-product-list-header > div > div > div:nth-child(2) > h5 > a");
    public By back = By.cssSelector("#wrapper > nav > div > ol > li:nth-child(2) > a > span");
    public By accesorii = By.cssSelector("#js-product-list-header > div > div > div:nth-child(3) > h5 > a");

    public void clickAcceptButton() {
        driver.findElement(accept).click();
    }

    public void clickAutentificareButton() {
        driver.findElement(autentificare).click();
    }

    public void creazaCont() {
        driver.findElement(creeazaCont).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(creeazaCont).click();
    }

    public void clickModAdresareButton() {
        driver.findElement(modAdresare).click();
    }

    public void setPrenume() {
        driver.findElement(prenume).click();
        driver.findElement(prenume).sendKeys("Adrian");
    }

    public void setNume() {
        driver.findElement(nume).click();
        driver.findElement(nume).sendKeys("Ghiveci");
        driver.findElement(nume).sendKeys(Keys.PAGE_DOWN);
    }

    public void setEmail() {
        driver.findElement(email).click();
        driver.findElement(email).sendKeys("ghiveci.adrian@yahoo.com");
    }

    public void setPassword() {
        driver.findElement(password).click();
        driver.findElement(password).sendKeys("Stefy24decembrie!");
    }

    public void clickGdpr() {
        driver.findElement(gdpr).click();
    }

    public void clickAmCont() {
        driver.findElement(amcont).click();
    }

    public void clickEmailLog() {
        driver.findElement(emailLog).click();
        driver.findElement(emailLog).sendKeys("ghiveci.adrian@yahoo.com");
    }

    public void clickLoginPass() {
        driver.findElement(loginPass).click();
        driver.findElement(loginPass).sendKeys("ghiveci.adrian@yahoo.com");
    }

    public void clickConfirmare() {
        driver.findElement(confirmare).click();
    }

    public void clickSearchCreion() {
        driver.findElement(searchCreion).click();
        driver.findElement(searchCreion).sendKeys("Creion");
    }

    public void clickSearchButton() {
        driver.findElement(search1).click();
    }

    public void clickHome() {
        driver.findElement(home1).click();
    }

    public void clickDreapta() {
        driver.findElement(dreapta).click();
        driver.findElement(dreapta).click();
    }

    public void clickStangat() {
        driver.findElement(stanga).click();
        driver.findElement(stanga).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(stanga).sendKeys(Keys.PAGE_DOWN);
    }

    public void clickCabluri() {
        driver.findElement(cabluri).click();
    }

    public void clickEndoscop() {
        driver.findElement(endoscop).click();
    }

    public void clickBack() {
        driver.findElement(back).click();
    }

    public void clickAccesorii() {
        driver.findElement(accesorii).click();
    }

}