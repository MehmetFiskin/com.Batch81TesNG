package tests.day19;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_PozitifTest {
    @Test
    public void pozitifTest() {

        //https://www.hotelmycamp.com/ adresine git  login butonuna bas
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        HmcPage hmcPage = new HmcPage();
        /*Page class'ındaki locate'lerimize ulaşabilmek için
          Page classımızdan bir obje oluşturarak, oluşturmuş olduğumuz obje ile
          page classımızdaki locate'lerimize ulaşabiliriz
        */
        hmcPage.login.click();

        //test data username: manager ,
        //test data password : Manager1!
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        hmcPage.userName.sendKeys(ConfigReader.getProperty("user"));
        hmcPage.password.sendKeys(ConfigReader.getProperty("password"));
        hmcPage.login2.click();

        Assert.assertTrue(hmcPage.girisDogrulama.isDisplayed());

        //Driver.closeDriver();

    }
}
