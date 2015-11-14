import PageObjects.*;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by gauge on 6/8/15.
 */
public class Shoppe {
    @Step("Navigate to shoppe homepage")
    public void navigateToHomePage() throws InterruptedException {
        DriverFactory.driver.get(HomePage.Url);
        Thread.sleep(5000);


    }

    @Step("Add item <Yealink T20P> to my basket")
    public void addItemToBasket(String item) throws InterruptedException {
        HomePage homePage = PageFactory.initElements(DriverFactory.driver, HomePage.class);
        homePage.ScreenShot(DriverFactory.driver, "resources/", "homepage");
        homePage.addItem(item);
        Thread.sleep(5000);
        homePage.ScreenShot(DriverFactory.driver, "resources/", "additem");



    }

    @Step("Check if my basket has item <item>")
    public void checkBasket(String item) throws InterruptedException {
        navigateToHomePage();
        HomePage homePage = PageFactory.initElements(DriverFactory.driver, HomePage.class);
        homePage.viewMyBag();
        homePage.ScreenShot(DriverFactory.driver, "resources/", "vewMyBag");
        Thread.sleep(5000);
        MyBasketPage myBasketPage = PageFactory.initElements(DriverFactory.driver, MyBasketPage.class);
        myBasketPage.checkProductExists(item);
        myBasketPage.ScreenShot(DriverFactory.driver, "resources/", "checkProductExists");
        Thread.sleep(5000);

    }

    @Step("Check if total price is <$75.59>")
    public void checkTotalPrice(String price) throws InterruptedException {
        MyBasketPage myBasketPage = PageFactory.initElements(DriverFactory.driver, MyBasketPage.class);
        myBasketPage.checkTotal(price);
        Thread.sleep(5000);
        myBasketPage.ScreenShot(DriverFactory.driver, "resources/", "checkTotal");


    }

    @Step("Checkout items in basket")
    public void checkoutAllItems() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(DriverFactory.driver, HomePage.class);
        homePage.checkout();
        Thread.sleep(5000);
        homePage.ScreenShot(DriverFactory.driver, "resources/", "checkout");


    }

    @Step("Accept the default address")
    public void acceptDefaultAddress() throws InterruptedException {
        CheckOutPage checkOutPage = PageFactory.initElements(DriverFactory.driver, CheckOutPage.class);
        checkOutPage.makePayment();
        Thread.sleep(5000);
        checkOutPage.ScreenShot(DriverFactory.driver, "resources/", "makePayment");

    }


    @Step("Make payment with card number <68628348> and security code <789>")
    public void makePayment(String cardNumber, String code) throws InterruptedException {
        PaymentPage paymentPage = PageFactory.initElements(DriverFactory.driver, PaymentPage.class);
        paymentPage.enterDetails(cardNumber, code);
        Thread.sleep(5000);
        paymentPage.ScreenShot(DriverFactory.driver, "resources/", "enterDetails");
        paymentPage.reviewOrder();
        Thread.sleep(5000);
        paymentPage.ScreenShot(DriverFactory.driver, "resources/", "reviewOrder");

    }

    @Step("Confirm order submission")
    public void confirmOrder() throws InterruptedException {
        ConfirmationPage confirmationPage = PageFactory.initElements(DriverFactory.driver, ConfirmationPage.class);
        confirmationPage.reviewOrder();
        Thread.sleep(5000);
        confirmationPage.ScreenShot(DriverFactory.driver, "resources/", "reviewOrder");
        HomePage homePage = PageFactory.initElements(DriverFactory.driver, HomePage.class);
        homePage.checkIfOrderIsPlaced();
        Thread.sleep(5000);
        homePage.ScreenShot(DriverFactory.driver, "resources/", "checkIfOrderIsPlaced");

    }
}
