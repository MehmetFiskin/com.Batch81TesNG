package tests.day18;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C01_PageClassFacebookTest {
    /*
    https://www.facebook.com/ adresine gidin
    POM’a uygun olarak email, sifre kutularini ve giris yap
    butonunu locate edin
    Faker class’ini kullanarak email ve sifre degerlerini
    yazdirip, giris butonuna basin
    Basarili giris yapilamadigini test edin
     */

    @Test
    public void test01() {
        Driver.getDriver().get("https://www.facebook.com/");

        Faker faker = new Faker();
        FacebookPage facebookPage = new FacebookPage();
        facebookPage.email.sendKeys(faker.internet().emailAddress());
        facebookPage.password.sendKeys(faker.phoneNumber().phoneNumber());
        facebookPage.login.click();

        //Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girisYapilmadi.isDisplayed());
    }
}
