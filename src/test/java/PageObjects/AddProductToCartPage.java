package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AddProductToCartPage {
    WebDriver driver;
    @FindBy(xpath ="//button[text()='Continue']")
    WebElement continueButton;

    @FindBy(xpath ="//button[@data-test='cookie-accept-all']")
    WebElement acceptAllCookies;

    @FindBy(xpath ="//button[@data-test='search-input-button']")
    WebElement searchButton;

    @FindBy(xpath ="//input[@data-test='search-input']")
    WebElement enterInput;

    @FindBy(xpath ="(//button[@data-test='add-to-cart-skroll-cta'])[1]")
    WebElement addToCart;

    @FindBy(xpath ="(//button[@data-test='add-to-cart-skroll-cta'])[1]//..//..//a[@data-test='product-leaf-title-link']/span")
    WebElement getProductName;

    @FindBy(xpath ="//a[text()='View My Bag']")
    WebElement viewCart;

    public void VerifyProductBasket(String userInput){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        continueButton.click();
        acceptAllCookies.click();
        searchButton.click();
        enterInput.sendKeys(userInput+Keys.ENTER);
        addToCart.click();
        String productName=getProductName.getText();
        viewCart.click();
    }

       public AddProductToCartPage(WebDriver driver) {
        this.driver=driver;
           }

    }


