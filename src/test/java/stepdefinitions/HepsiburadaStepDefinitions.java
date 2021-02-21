package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HepsiBuradaHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HepsiburadaStepDefinitions {
    HepsiBuradaHomePage hepsiburadaHomePage = new HepsiBuradaHomePage();




    @Given("Hepsiburada sitesi acilacak ve anasayfanin acildigini onaylayacak")
    public void hepsiburada_sitesi_acilacak_ve_anasayfanin_acildigini_onaylayacak() {
        Driver.getDriver().get(ConfigReader.getProperty("hepsiburada_url"));
        System.out.println(Driver.getDriver().getCurrentUrl());
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("expected_url"));
    }

    @Given("Login ekranini acip, bir kullanici ile login olacak")
    public void login_ekranini_acip_bir_kullanici_ile_login_olacak() {
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(hepsiburadaHomePage.girisyap).perform();
        ReusableMethods.waitFor(3);
        actions.click(hepsiburadaHomePage.login).perform();
        ReusableMethods.waitFor(5);
        hepsiburadaHomePage.loginEmail.sendKeys(ConfigReader.getProperty("hepsiburada_mail"));
        hepsiburadaHomePage.loginSifre.sendKeys(ConfigReader.getProperty("hepsiburada_sifre"));
        ReusableMethods.waitFor(5);
        hepsiburadaHomePage.login2.click();

    }
    @Given("Ekranin ustundeki Search alanina samsung yazip Ara butonuna tiklayacak")
    public void ekranin_ustundeki_search_alanina_samsung_yazip_ara_butonuna_tiklayacak() {
        hepsiburadaHomePage.searchBox.sendKeys(ConfigReader.getProperty("aranan_kelime"));
        ReusableMethods.waitFor(1);
        hepsiburadaHomePage.ara.click();
        ReusableMethods.waitFor(1);

    }
    @Then("Sol menuden Telefon sonrasinda Cep Telefonu tiklayacak")
    public void sol_menuden_telefon_sonrasinda_cep_telefonu_tiklayacak() {
        hepsiburadaHomePage.telefonDropDown.click();
        ReusableMethods.waitFor(3);
        hepsiburadaHomePage.ceptelefonu.click();


    }
    @Then("Gelen sayfada samsung icin sonuc bulundugunu onaylayacak")
    public void gelen_sayfada_samsung_icin_sonuc_bulundugunu_onaylayacak() {
        System.out.println(hepsiburadaHomePage.samsungDogrulama.getText());
        Assert.assertTrue(hepsiburadaHomePage.samsungDogrulama.getText().contains("samsung"));

    }
    @Then("Arama sonuclarindan ikinci sayfaya tiklayacak ve acilan sayfada ikinci sayfanin su an gosterimde oldugunu onaylayacak")
    public void arama_sonuclarindan_ikinci_sayfaya_tiklayacak_ve_acilan_sayfada_ikinci_sayfanin_su_an_gosterimde_oldugunu_onaylayacak() {
        Actions actions = new Actions(Driver.getDriver());
        ReusableMethods.waitFor(2);
        ReusableMethods.scrollToElement(hepsiburadaHomePage.page2);
        hepsiburadaHomePage.page2.click();
        System.out.println(Driver.getDriver().getCurrentUrl());
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("sayfa=2"));
    }
    @When("Ustten besinci urunu tiklayacak")
    public void ustten_besinci_urunu_tiklayacak() {
        ReusableMethods.waitFor(2);
        hepsiburadaHomePage.product5.click();

    }
    @Then("Urun detayinda Begen butonuna tiklayacak")
    public void urun_detayinda_begen_butonuna_tiklayacak() {
        Actions actions = new Actions(Driver.getDriver());
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        String seciliUrunAdi=hepsiburadaHomePage.secilenUrun.getText();
        ReusableMethods.waitFor(1);
        hepsiburadaHomePage.begenButton.click();

    }
    @Then("Urun listenize eklendi.' popup kontrolu yapacak")
    public void urun_listenize_eklendi_popup_kontrolu_yapacak() {
        ReusableMethods.waitFor(1);
        String actualResult=hepsiburadaHomePage.begeneneeklendi.getText();
        System.out.println(actualResult);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(actualResult.contains("eklendi"));


    }
    @Then("Ekranin en ustundeki hesabim alaninda Begendiklerim tiklayacak")
    public void ekranin_en_ustundeki_hesabim_alaninda_begendiklerim_tiklayacak() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.waitFor(2);
        actions.moveToElement(hepsiburadaHomePage.hesabım).perform();
        ReusableMethods.waitFor(1);
        actions.click(hepsiburadaHomePage.begendiklerim).perform();

    }
    @Then("Acilan sayfada bir onceki sayfada begendiklerime alinmis urunun bulundugunu onaylayacak")
    public void acilan_sayfada_bir_onceki_sayfada_begendiklerime_alinmis_urunun_bulundugunu_onaylayacak() {
        Actions actions = new Actions(Driver.getDriver());
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        String seciliUrunAdi2 =  hepsiburadaHomePage.secilenUrunBegendiklerim.getText();
        Assert.assertTrue(seciliUrunAdi2.contains("Samsung"));

    }
    @Then("Begendiklerime alinmis urun bulunup secilecek ve sepete eklenecek")
    public void begendiklerime_alinmis_urun_bulunup_secilecek_ve_sepete_eklenecek() {
        Actions actions = new Actions(Driver.getDriver());
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.moveToElement(hepsiburadaHomePage.secilenUrunBegendiklerim).perform();
        ReusableMethods.waitFor(1);
        hepsiburadaHomePage.sepeteEkle.click();

    }
    @Then("Urun sepete eklendi' popup kontrolu yapacak")
    public void urun_sepete_eklendi_popup_kontrolu_yapacak() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(hepsiburadaHomePage.sepeteEklendiPopUp.isDisplayed());

    }
    @Then("Sepetim sayfasina gidecek")
    public void sepetim_sayfasina_gidecek() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.waitFor(6);
        hepsiburadaHomePage.sepetimeGit.click();

    }
    @Then("Sepete eklenen bu urunun icine girilip kaldir butonuna basilacak, sepetimden cikarilacak")
    public void sepete_eklenen_bu_urunun_icine_girilip_kaldir_butonuna_basilacak_sepetimden_cikarilacak() {
        ReusableMethods.waitFor(2);
        hepsiburadaHomePage.copKutusu.click();

    }
    @Then("Bu urunun artik sepette olmadigini onaylayacak")
    public void bu_urunun_artik_sepette_olmadigini_onaylayacak() {
        ReusableMethods.waitFor(2);
        String urununsilindigidogrulama =  hepsiburadaHomePage.urununSilindiginiDogrulama.getText();
        System.out.println(urununsilindigidogrulama);
        Assert.assertTrue(urununsilindigidogrulama.contains("silin"));

    }


}
