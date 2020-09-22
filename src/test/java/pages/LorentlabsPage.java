package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class LorentlabsPage {
    public LorentlabsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//i[@class='search']")
    public WebElement araTikla;
    @FindBy(xpath = "//input[@id='s']")
    public WebElement ara;
    @FindBy(xpath = "//*[@id=\"site\"]/div[4]/section/div/div[1]/div/div/div[2]/div/div")
    public List<WebElement> liste;

    @FindBy(xpath = "//*[@id=\"menu-item-2757\"]/a")
    public WebElement incele;

    @FindBy(xpath = "//span[@class='bg']")
    public WebElement icerikYukle;
    @FindBy(xpath = "//li[@id='menu-item-2743']")
    public  WebElement haberler;

    @FindBy(xpath = "//div[@class='categoryFocusedTabPosts']")
    public List<WebElement> haberSayfa;

    @FindBy(xpath = "//li[@id='menu-item-2806']")
    public  WebElement karsilastir;

    @FindBy(xpath = "//li[@id='menu-item-2758']")
    public  WebElement kriptopara;

    @FindBy(xpath = "//li[@id='menu-item-2744']")
    public  WebElement siberguvenlik;

    @FindBy(xpath = "//li[@id='menu-item-2807']")
    public  WebElement iletisim;








}
