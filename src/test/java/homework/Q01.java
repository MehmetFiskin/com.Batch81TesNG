package homework;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class Q01 {
    @Test
    public void test() {
        // 'http://automationexercise.com' url'sine gidin
        AutomationExercisePage auto = new AutomationExercisePage();
        Driver.getDriver().get(ConfigReader.getProperty("automationExerciseUrl"));

        // Ana sayfanın başarıyla görünür olduğunu doğrulayın
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://automationexercise.com";
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        //Assert.assertEquals(expectedUrl,actualUrl);

        //4. 'Kayıt Ol / Giriş Yap' düğmesini tıklayın
        auto.login.click();

        //5. Kayıt bölümündeki tüm ayrıntıları doldurun ve hesap oluşturun
        Faker faker = new Faker();
        auto.name.sendKeys(faker.name().firstName());
        auto.eMail.sendKeys(faker.internet().emailAddress());
        auto.signUp.click();

        //6. 'HESAP OLUŞTURULDU!' seçeneğini doğrulayın. ve 'Devam' düğmesini tıklayın
        Actions actions = new Actions(Driver.getDriver());

        auto.mrButton.click();

        actions.sendKeys(Keys.TAB).sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB).sendKeys("10").sendKeys(Keys.TAB).sendKeys("May").sendKeys(Keys.TAB).sendKeys("1985")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB).sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).sendKeys("team13")
                .sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress()).sendKeys(Keys.TAB).sendKeys(faker.address().cityName())
                .sendKeys(Keys.TAB).sendKeys("Canada").sendKeys(Keys.TAB).sendKeys(faker.address().state()).sendKeys(Keys.TAB)
                .sendKeys(faker.address().city()).sendKeys(Keys.TAB).sendKeys(faker.address().zipCode()).sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone()).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();


        //7. En üstte 'Kullanıcı adı olarak oturum açıldı' seçeneğini doğrulayın
        //8. Sepete ürün ekleyin
        //9. 'Sepet' düğmesini tıklayın
        //10. Sepet sayfasının görüntülendiğini doğrulayın
        //11. Ödemeye Devam Et'e tıklayın
        //12. Teslimat adresinin, hesap kaydı sırasında girilen adresle aynı olduğunu doğrulayın.
        //13. Fatura adresinin, hesap kaydı sırasında girilen adresle aynı olduğunu doğrulayın.
        //14. 'Hesabı Sil' düğmesini tıklayın
        //15. 'HESAP SİLİNDİ!' seçeneğini doğrulayın. ve 'Devam' düğmesini tıklayın*/

    }

}
