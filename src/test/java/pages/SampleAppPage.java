package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleAppPage {

    private WebDriver driver;


    public SampleAppPage (WebDriver driver){
        this.driver = driver;
    }

    // Page elements
    @FindBy(how = How.ID, using = "nav_motorcycle") WebElement navMotorcycle;
    @FindBy(how = How.ID, using = "make") WebElement fieldMake;
    @FindBy(how = How.ID, using = "model") WebElement fieldModel;
    @FindBy(how = How.ID, using = "cylindercapacity") WebElement fieldCylinderCap;
    @FindBy(how = How.ID, using = "engineperformance") WebElement fieldEngPerf;
    @FindBy(how = How.ID, using = "dateofmanufacture") WebElement fieldDtOfManufacture;
    @FindBy(how = How.ID, using = "numberofseatsmotorcycle") WebElement fieldNumberOfSeats;
    @FindBy(how = How.ID, using = "listprice") WebElement fieldListPrice;
    @FindBy(how = How.ID, using = "annualmileage") WebElement fieldAnnualMileage;
    @FindBy(how = How.ID, using = "nextenterinsurantdata") WebElement buttonNext;
    @FindBy(how = How.XPATH, using = "//*[@id=\"entervehicledata\"]/span") WebElement vehicleFieldCounter;
    @FindBy(how = How.ID, using = "enterinsurantdata") WebElement tabEnterInsurantData;

    @FindBy(how = How.ID, using = "firstname") WebElement fieldFirstName;
    @FindBy(how = How.ID, using = "lastname") WebElement fieldLastName;
    @FindBy(how = How.ID, using = "birthdate") WebElement fieldBirthDate;
    @FindBy(how = How.XPATH, using = "//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span")
    WebElement radioGenderMale;
    @FindBy(how = How.ID, using = "streetaddress") WebElement fieldStreetAddress;
    @FindBy(how = How.ID, using = "country") WebElement fieldCountry;
    @FindBy(how = How.ID, using = "zipcode") WebElement fieldZipcode;
    @FindBy(how = How.ID, using = "city") WebElement fieldCity;
    @FindBy(how = How.ID, using = "occupation") WebElement fieldOccupation;
    @FindBy(how = How.XPATH, using = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span")
    WebElement checkSpeeding;
    @FindBy(how = How.ID, using = "website") WebElement fieldWebsite;
    @FindBy(how = How.ID, using = "nextenterproductdata") WebElement buttonNextEnterProductData;
    @FindBy(how = How.XPATH, using = "//*[@id=\"enterinsurantdata\"]/span\n") WebElement insurantFieldCounter;
    @FindBy(how = How.ID, using = "enterproductdata") WebElement tabEnterProductData;

    @FindBy(how = How.ID, using = "startdate") WebElement fieldStartDate;
    @FindBy(how = How.ID, using = "insurancesum") WebElement fieldInsuranceSum;
    @FindBy(how = How.ID, using = "damageinsurance") WebElement fieldDamageInsurance;
    @FindBy(how = How.XPATH, using = "//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[2]/span")
    WebElement checkLegalDefInsur;
    @FindBy(how = How.XPATH, using = "//*[@id=\"enterproductdata\"]/span")
    WebElement productFieldCounter;
    @FindBy(how = How.ID, using = "nextselectpriceoption") WebElement buttonNextSelectPriceOption;
    @FindBy(how = How.ID, using = "selectpriceoption") WebElement tabSelectPriceOption;

    @FindBy(how = How.XPATH, using = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span")
    WebElement radioGoldOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"selectpriceoption\"]/span")
    WebElement selectPriceOptFieldCounter;
    @FindBy(how = How.ID, using = "nextsendquote") WebElement buttonNextSendQuote;
    @FindBy(how = How.ID, using = "sendquote") WebElement tabSendQuote;

    @FindBy(how = How.ID, using = "email") WebElement fieldEmail;
    @FindBy(how = How.ID, using = "phone") WebElement fieldPhone;
    @FindBy(how = How.ID, using = "username") WebElement fieldUsername;
    @FindBy(how = How.ID, using = "password") WebElement fieldPassword;
    @FindBy(how = How.ID, using = "confirmpassword") WebElement fieldConfirmPassword;
    @FindBy(how = How.ID, using = "Comments") WebElement fieldComments;
    @FindBy(how = How.XPATH, using = "//*[@id=\"sendquote\"]/span")
    WebElement sendQuoteFieldCounter;
    @FindBy(how = How.ID, using = "sendemail") WebElement buttonSendEmail;

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/h2") WebElement successMessage;

    // Methods
    public void wait_and_click_navMotorcycle () {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(navMotorcycle));
        navMotorcycle.click();
    }

    public void wait_and_fill_fieldMake (String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldMake));
        fieldMake.sendKeys(text);
    }

    public void wait_and_fill_fieldModel (String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldModel));
        fieldModel.sendKeys(text);
    }

    public void wait_and_fill_fieldCylinderCap (String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldCylinderCap));
        fieldCylinderCap.sendKeys(text);
    }

    public void wait_and_fill_fieldEngPerf (String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldEngPerf));
        fieldEngPerf.sendKeys(text);
    }

    public void wait_and_fill_fieldDtOfManufacture (String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldDtOfManufacture));
        fieldDtOfManufacture.sendKeys(text);
    }

    public void wait_and_fill_fieldNumberOfSeats (String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldNumberOfSeats));
        fieldNumberOfSeats.sendKeys(text);
    }

    public void wait_and_fill_fieldListPrice (String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldListPrice));
        fieldListPrice.sendKeys(text);
    }

    public void wait_and_fill_fieldAnnualMileage (String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldAnnualMileage));
        fieldAnnualMileage.sendKeys(text);
    }

    public void wait_and_click_buttonNext () {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(buttonNext));
        buttonNext.click();
    }

    public int wait_and_return_vehicle_field_counter(){
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(vehicleFieldCounter));
        return Integer.parseInt(vehicleFieldCounter.getText());
    }

    public boolean wait_and_return_tab_insurant_data_is_displayed(){
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(tabEnterInsurantData));
        return tabEnterInsurantData.isDisplayed();
    }

    public void wait_and_fill_fieldFirstName (String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldFirstName));
        fieldFirstName.sendKeys(text);
    }

    public void wait_and_fill_fieldLastName (String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldLastName));
        fieldLastName.sendKeys(text);
    }

    public void wait_and_fill_fieldBirthDate (String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldBirthDate));
        fieldBirthDate.sendKeys(text);
    }

    public void wait_and_click_radioGenderMale () {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(radioGenderMale));
        radioGenderMale.click();
    }

    public void wait_and_fill_fieldStreetAddress(String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldStreetAddress));
        fieldStreetAddress.sendKeys(text);
    }

    public void wait_and_fill_fieldCountry(String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldCountry));
        fieldCountry.sendKeys(text);
    }

    public void wait_and_fill_fieldZipcode(String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldZipcode));
        fieldZipcode.sendKeys(text);
    }

    public void wait_and_fill_fieldCity(String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldCity));
        fieldCity.sendKeys(text);
    }

    public void wait_and_fill_fieldOccupation(String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldOccupation));
        fieldOccupation.sendKeys(text);
    }

    public void wait_and_click_checkSpeeding() {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(checkSpeeding));
        checkSpeeding.click();
    }

    public void wait_and_fill_fieldWebsite(String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldWebsite));
        fieldWebsite.sendKeys(text);
    }

    public void wait_and_click_buttonNextEnterProductData() {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(buttonNextEnterProductData));
        buttonNextEnterProductData.click();
    }

    public int wait_and_return_insurant_field_counter(){
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(insurantFieldCounter));
        return Integer.parseInt(insurantFieldCounter.getText());
    }

    public boolean wait_and_return_tab_product_data_is_displayed(){
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(tabEnterProductData));
        return tabEnterProductData.isDisplayed();
    }

    public void wait_and_fill_fieldStartDate(String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldStartDate));
        fieldStartDate.sendKeys(text);
    }

    public void wait_and_fill_fieldInsuranceSum(String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldInsuranceSum));
        fieldInsuranceSum.sendKeys(text);
    }

    public void wait_and_fill_fieldDamageInsurance(String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldDamageInsurance));
        fieldDamageInsurance.sendKeys(text);
    }

    public void wait_and_click_checkLegalDefInsur() {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(checkLegalDefInsur));
        checkLegalDefInsur.click();
    }

    public int wait_and_return_product_field_counter(){
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(productFieldCounter));
        return Integer.parseInt(productFieldCounter.getText());
    }

    public void wait_and_click_buttonNextSelectPriceOption() {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(buttonNextSelectPriceOption));
        buttonNextSelectPriceOption.click();
    }

    public int wait_and_return_select_price_opt_field_counter(){
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(selectPriceOptFieldCounter));
        return Integer.parseInt(selectPriceOptFieldCounter.getText());
    }

    public boolean wait_and_return_tab_select_price_option_is_displayed(){
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(tabSelectPriceOption));
        return tabSelectPriceOption.isDisplayed();
    }

    public void wait_and_click_radioGoldOption () {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(radioGoldOption));
        radioGoldOption.click();
    }

    public void wait_and_click_buttonNextSendQuote() {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(buttonNextSendQuote));
        buttonNextSendQuote.click();
    }

    public boolean wait_and_return_tab_send_quote_is_displayed(){
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(tabSendQuote));
        return tabSendQuote.isDisplayed();
    }

    public void wait_and_fill_fieldEmail(String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldEmail));
        fieldEmail.sendKeys(text);
    }

    public void wait_and_fill_fieldPhone(String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldPhone));
        fieldPhone.sendKeys(text);
    }

    public void wait_and_fill_fieldUsername(String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldUsername));
        fieldUsername.sendKeys(text);
    }

    public void wait_and_fill_fieldPassword(String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldPassword));
        fieldPassword.sendKeys(text);
    }

    public void wait_and_fill_fieldConfirmPassword(String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldConfirmPassword));
        fieldConfirmPassword.sendKeys(text);
    }

    public void wait_and_fill_fieldComments(String text) {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(fieldComments));
        fieldComments.sendKeys(text);
    }

    public int wait_and_return_send_quote_field_counter(){
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(sendQuoteFieldCounter));
        return Integer.parseInt(sendQuoteFieldCounter.getText());
    }

    public void wait_and_click_buttonSendEmail() {
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(buttonSendEmail));
        buttonSendEmail.click();
    }

    public String wait_and_return_success_message(){
        int timeout = 10;
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(successMessage));
        return successMessage.getText();
    }
}
