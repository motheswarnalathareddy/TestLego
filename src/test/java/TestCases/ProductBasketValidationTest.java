package TestCases;

import PageObjects.AddProductToCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;


public class ProductBasketValidationTest extends BaseSetup {

    @Test
    public void VerifyProductBasket(){
        AddProductToCartPage addProductToCartPage =PageFactory.initElements(driver, AddProductToCartPage.class);
        addProductToCartPage.VerifyProductBasket(config.getProductName());
        Assert.assertTrue(driver.findElement(By.xpath("//h1")).getText().contains("My Bag"));
    }
}
