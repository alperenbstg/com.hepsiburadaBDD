package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HepsiBuradaHomePage {
    public HepsiBuradaHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//span[@title='Giriş Yap']")
    public WebElement girisyap;
    @FindBy(id = "login")
    public WebElement login;
    @FindBy(id = "txtUserName")
    public WebElement loginEmail;
    @FindBy(xpath = "//input[@id='txtPassword']")
    public WebElement loginSifre;
    @FindBy(xpath = "//input[@type='text']")
    public WebElement searchBox;
    @FindBy(id = "btnLogin")
    public WebElement login2;
    @FindBy(xpath ="//div[@class='SearchBoxOld-buttonContainer']")
    public WebElement ara;
    @FindBy(linkText = "Çıkış Yap")
    public WebElement cikisYap;
    @FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div/div/div/div[1]/section/div/div/div/ol/li[1]/ol/li[1]/label")
    public WebElement telefonDropDown;
    @FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div/div/div/div[1]/section/div/div/div/ol/li[1]/ol/li[3]/label")
    public WebElement ceptelefonu;
    @FindBy(xpath = "//header[@class='container title-wrapper for-suggestion']")
    public WebElement samsungDogrulama;
    @FindBy(linkText = "Aradığınız ürünü bulabildiniz mi?")
    public WebElement searchProduct;
    @FindBy (xpath = "//a[@class='page-2 ']")
    public WebElement page2;
    @FindBy(xpath = "//a[@data-position='6']")
    public WebElement product5;
    @FindBy(xpath = "//div[@class='Like-1divm']")
    public  WebElement begenButton;
    @FindBy(xpath = "//div[@class='hb-toast-text']")
    public WebElement begeneneeklendi;
    @FindBy(xpath = "//a[@Title='Beğendiklerim']")
    public WebElement begendiklerim;
    @FindBy(xpath = "//div[@id='myAccount']")
    public WebElement hesabım;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div")
    public  WebElement secilenUrunBegendiklerim;
    @FindBy(xpath = "//span[@class='product-name']")
    public  WebElement secilenUrun;
    @FindBy(xpath = "//button[@id='addToCart']")
    public WebElement addToCart;
    @FindBy(xpath = "//div[@class='sf-SalesFrontCashProductInfo-2XSfb']")
    public WebElement urunSepetinizde;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/div[3]/div[3]/span")
    public WebElement sepeteEkle;
    @FindBy(xpath = "//div[@class='hb-toast-content-holder']")
    public WebElement sepeteEklendiPopUp;
    @FindBy(xpath = "(//div[@class='sf-HeaderButton-rPL-k'])[2]")
    public WebElement sepetimeGit;
    @FindBy(xpath = "//a[@class='product_delete_1zR-0']")
    public WebElement copKutusu;
    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/span")
    public WebElement urununSilindiginiDogrulama;

}
