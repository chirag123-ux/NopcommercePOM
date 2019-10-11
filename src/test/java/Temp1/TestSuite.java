package Temp1;

import NopCommerceProject1.*;
import org.testng.annotations.Test;

    public class TestSuite extends BaseTest {
            //object for homepage
            HomePage homePage = new HomePage();
            //object for registerpage
            RegisterPage registerPage = new RegisterPage();
            //object for registrationpage
            RegistrationResultPage registrationResultPage = new RegistrationResultPage();
            //object for applemacbookpage
            AppleMacBookPage appleMacBookPage = new AppleMacBookPage();
            //object for emailfriendpage
            EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
            //object for htconem8anroidpage
            HtcOneM8AnroidPage htcOneM8AnroidPage = new HtcOneM8AnroidPage();
            //object for shoppingcartpage
            ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
            //object for checkoutpage
            CheckOutPage checkOutPage = new CheckOutPage();


    @Test
    public void usershouldableToRegisterSuccessfully(){
            //click on register on homepage
            homePage.clickRegisterPage();
            //assert on registerpage that user on registerpage
            registerPage.toVerifyuserShouldBeonRgistrationPage();
            //user enter all registration deatils on registerpage
            registerPage.UserEnterRegistrationDetails();
            //user asssert the result on registrationresultpage and see the message
            registrationResultPage.userShouldBeAbleToSeeRegistrationMessageSuccessfully();

    }

    @Test
    public void registerUserAbleToReferAProductAndEmailAFriend(){
            //click on register on homepage
            homePage.clickRegisterPage();
            //assert on registerpage that user on registerpage
            registerPage.toVerifyuserShouldBeonRgistrationPage();
            //user enter all registration deatils on registerpage;

            registerPage.UserEnterRegistrationDetails();
            //user asssert the result on registrationresultpage and see the message
            registrationResultPage.userShouldBeAbleToSeeRegistrationMessageSuccessfully();
            //click on homepagelink on homepage. user is on homepage of website
            registrationResultPage.clickHomePage();
            //click on applemacbook on homepage
            homePage.clickOnAppleMacBook();
            //to verify user on applemacbookpage.assert on applemacbookpage
            appleMacBookPage.toVerityUsershouldBeOnAppleMacBookPage();
            //click on emailafriendbutton
            appleMacBookPage.clickEmailAFriendButton();
            //to verify user on email a friendpage. assert on emaila friend page
            emailAFriendPage.toVerifyUserShouldBeOnEmailAFriendPage();
            //enter friend email and message. testdataconfig.properties
            emailAFriendPage.enterFriendEmailAndMessage();
            //user see the message
            emailAFriendPage.userAbleToSeeMessageSuccessfully();

    }


    @Test
    public void unRegisterUserShouldNotAbleToReferAProductToFriend() {
            //click on applemacbook
            homePage.clickOnAppleMacBook();
            //to verify user on applemacbookpage
            appleMacBookPage.toVerityUsershouldBeOnAppleMacBookPage();
            //click on email a friend button
            appleMacBookPage.clickEmailAFriendButton();
            //enter friend email, message, user email
            emailAFriendPage.enterFriendEmailAndMessageWithUserEmail();
            //user see the error message
            emailAFriendPage.userAbleToSeeErrorMessageOnThePage();

    }


    @Test
    public void userShouldBeAbleToBuyProductSuccessfully(){

            //click on register
            homePage.clickRegisterPage();
            //to verify user on registration page
            registerPage.toVerifyuserShouldBeonRgistrationPage();
            //user enter details on registration page
            registerPage.UserEnterRegistrationDetails();
            //user see registration message
            registrationResultPage.userShouldBeAbleToSeeRegistrationMessageSuccessfully();
            //click on homepage
            registrationResultPage.clickHomePage();
            //To click on Phone
            homePage.clickOnHTCOneM8Anroid();
            //To add to Cart
            htcOneM8AnroidPage.clickAddToCartButton();
           //To click on link of shopping cart
            htcOneM8AnroidPage.clickOnShoppingCartButton();
            //click on termsof service on shoppingcartpage
            shoppingCartPage.clickOnTermsOfService();
            //click on checkoutbutton on shopping cartpage
            shoppingCartPage.clickOnCheckoutButton();
            //to verify user on checkout page
            checkOutPage.toVerifyUserShouldBeOnCheckOutPage();
            //enter details of user
            checkOutPage.enterCountryCityAdd1PostalcodePhone();
            //click on continue button after fill userdetails
            checkOutPage.clickOnContinueButton1();
            //click on creditcard
            checkOutPage.clickOnCreditCardButton();
            //click on continue after click on credit card
            checkOutPage.clickOnContinueButton2();
            //click on creditcard dropdown and select mastercard
            checkOutPage.clickOnCreditcarddropdown();
            //enter cardholder details
            checkOutPage.enterCardHolderNameCardNumberExpiremonthExpireyearCvvnumber();
            //click oon confirm button
            checkOutPage.clickConfirmButton();
            //to verify user on confirm page
            checkOutPage.toVerifyUserShouldBeOncConfirmPage();

    }


@Test

    public  void guestUserCanByProduct(){

            //click on htconem8Anroid
            homePage.clickOnHTCOneM8Anroid();
            //to verify user on htconem8anroid
            htcOneM8AnroidPage.toVerifyUserShouldBeOnHtcOneM8AnroidPage();
            //click on addtocart button
            htcOneM8AnroidPage.clickAddToCartButton();
            //click on choppingcartbutton
            htcOneM8AnroidPage.clickOnShoppingCartButton();
            //to verify user on shoppingcart page
            shoppingCartPage.toVerifyUserShouldBeOnShoppingCartPage();
            //click on terms of service
            shoppingCartPage.clickOnTermsOfService();
            //click on checkout button
            shoppingCartPage.clickOnCheckoutButton();
            //click on guestcheckout
            checkOutPage.guestCheckOut();
            //enter the guest details
            checkOutPage.enterGuestNameEmailCountryCityAdd1PostalcodePhone();
            //click on continue button1
            checkOutPage.clickOnContinueButton1();
            //click on creditcardbutton
            checkOutPage.clickOnCreditCardButton();
            //click on continue button
            checkOutPage.clickOnContinueButton2();
            //click on creditcarddopdown and select mastercard
            checkOutPage.clickOnCreditcarddropdown();
            //enter the card holder details
            checkOutPage.enterCardHolderNameCardNumberExpiremonthExpireyearCvvnumber();
            //click confirm button
            checkOutPage.clickConfirmButton();
            //to verify user on confirm page
            checkOutPage.toVerifyUserShouldBeOncConfirmPage();






}


}
