package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.SampleAppPage;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class StepDefinitions {

    private WebDriver driver;
    private SampleAppPage samplePage;
    private final String URL = "http://sampleapp.tricentis.com/101/app.php";

    private SampleAppPage getSamplePage() {
        if (samplePage == null) {
            samplePage = PageFactory.initElements(driver, SampleAppPage.class);
        }
        return samplePage;
    }


    @Given("^I am logged on SamplePage home$")
    public void i_am_logged_on_SamplePage_home() throws Exception {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "src/test/resource/chromedriver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.navigate().to(URL);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    }

    @And("^I fill in the Enter vehicle data form$")
    public void i_fill_in_the_Enter_vehicle_data_form() throws Exception {
        fillEnterVehicleDataForm();
    }

    @And("^Verify the vehicle field counter$")
    public void verify_the_vehicle_field_counter() {
        SampleAppPage samplePage = getSamplePage();
        Assert.assertEquals(0 , samplePage.wait_and_return_vehicle_field_counter());
    }

    @When("^Click on the next button$")
    public void click_ont_the_next_button() throws Exception {
        SampleAppPage samplePage = getSamplePage();
        samplePage.wait_and_click_buttonNext();
    }

    @Then("^Tab Enter insurant data is displayed$")
    public void tab_enter_insurant_data_is_displayed() {
        SampleAppPage samplePage = getSamplePage();
        Assert.assertTrue(samplePage.wait_and_return_tab_insurant_data_is_displayed());
    }

    @And("^I fill in the Enter insurant data form$")
    public void i_fill_in_the_enter_insurant_data_form() {
        fillEnterInsurantDataForm();
    }

    @And("^Verify the insurant field counter$")
    public void verify_the_insurant_field_counter() {
        SampleAppPage samplePage = getSamplePage();
        Assert.assertEquals(0 , samplePage.wait_and_return_insurant_field_counter());
    }

    @When("^Click on the next product button$")
    public void click_on_the_next_product_button() throws Exception {
        SampleAppPage samplePage = getSamplePage();
        samplePage.wait_and_click_buttonNextEnterProductData();
    }

    @Then("^Tab Enter product data is displayed$")
    public void tab_enter_product_data_is_displayed() {
        SampleAppPage samplePage = getSamplePage();
        Assert.assertTrue(samplePage.wait_and_return_tab_product_data_is_displayed());
    }

    @And("^I fill in the Enter product data form$")
    public void i_fill_in_the_enter_product_data_form() {
        fillEnterProductDataForm();
    }

    @And("^Verify the product field counter$")
    public void verify_the_product_field_counter() {
        SampleAppPage samplePage = getSamplePage();
        Assert.assertEquals(0 , samplePage.wait_and_return_product_field_counter());
    }

    @When("^Click on the next select price option button$")
    public void click_on_the_next_select_price_option_button() throws Exception {
        SampleAppPage samplePage = getSamplePage();
        samplePage.wait_and_click_buttonNextSelectPriceOption();
    }

    @Then("^Tab select price option is displayed$")
    public void tab_select_price_option_is_displayed() {
        SampleAppPage samplePage = getSamplePage();
        Assert.assertTrue(samplePage.wait_and_return_tab_select_price_option_is_displayed());
    }

    @And("^I select golg option$")
    public void i_select_gold_option() {
        SampleAppPage samplePage = getSamplePage();
        samplePage.wait_and_click_radioGoldOption();
    }

    @And("^Verify the select price option field counter$")
    public void verify_the_select_price_option_field_counter() {
        SampleAppPage samplePage = getSamplePage();
        Assert.assertEquals(0 , samplePage.wait_and_return_select_price_opt_field_counter());
    }

    @When("^Click on the next send quote button$")
    public void click_on_the_next_send_quote_button() {
        SampleAppPage samplePage = getSamplePage();
        samplePage.wait_and_click_buttonNextSendQuote();
    }

    @Then("^Tab send quote is displayed$")
    public void tab_send_quote_is_displayed() {
        SampleAppPage samplePage = getSamplePage();
        Assert.assertTrue(samplePage.wait_and_return_tab_send_quote_is_displayed());
    }

    @And("^I fill in the Send Quote data form$")
    public void i_fill_in_the_send_quote_data_form() {
        fillSendQuoteDataForm();
    }

    @And("^Verify the send quote field counter$")
    public void verify_the_send_quote_field_counter() {
        SampleAppPage samplePage = getSamplePage();
        Assert.assertEquals(0 , samplePage.wait_and_return_send_quote_field_counter());
    }

    @When("^Click on the send email button$")
    public void click_on_the_send_email_button() {
        SampleAppPage samplePage = getSamplePage();
        samplePage.wait_and_click_buttonSendEmail();
    }

    @Then("^Verify success message$")
    public void verify_success_message(){
        SampleAppPage samplePage = getSamplePage();
        Assert.assertEquals("Sending e-mail success!",
                samplePage.wait_and_return_success_message());
    }

    private void fillEnterVehicleDataForm(){
        SampleAppPage samplePage = getSamplePage();
        samplePage.wait_and_click_navMotorcycle();
        samplePage.wait_and_fill_fieldMake("Honda");
        samplePage.wait_and_fill_fieldModel("Motorcycle");
        samplePage.wait_and_fill_fieldCylinderCap("300");
        samplePage.wait_and_fill_fieldEngPerf("160");
        samplePage.wait_and_fill_fieldDtOfManufacture("10/01/2020");
        samplePage.wait_and_fill_fieldNumberOfSeats("2");
        samplePage.wait_and_fill_fieldListPrice("4500");
        samplePage.wait_and_fill_fieldAnnualMileage("18000");
    }

    private void fillEnterInsurantDataForm() {
        SampleAppPage samplePage = getSamplePage();
        samplePage.wait_and_fill_fieldFirstName("Thiago");
        samplePage.wait_and_fill_fieldLastName("Basilio");
        samplePage.wait_and_fill_fieldBirthDate("12/21/1989");
        samplePage.wait_and_click_radioGenderMale();
        samplePage.wait_and_fill_fieldStreetAddress("Rua Boa Vista");
        samplePage.wait_and_fill_fieldCountry("Brazil");
        samplePage.wait_and_fill_fieldZipcode("05565000");
        samplePage.wait_and_fill_fieldCity("Sao Paulo");
        samplePage.wait_and_fill_fieldOccupation("Employee");
        samplePage.wait_and_click_checkSpeeding();
        samplePage.wait_and_fill_fieldWebsite("www.teste.com.br");
    }

    private void fillEnterProductDataForm(){
        SampleAppPage samplePage = getSamplePage();
        samplePage.wait_and_fill_fieldStartDate("09/01/2021");
        samplePage.wait_and_fill_fieldInsuranceSum("3");
        samplePage.wait_and_fill_fieldDamageInsurance("Partial Coverage");
        samplePage.wait_and_click_checkLegalDefInsur();
    }

    private void fillSendQuoteDataForm(){
        SampleAppPage samplePage = getSamplePage();
        samplePage.wait_and_fill_fieldEmail("thiago@domain.com.br");
        samplePage.wait_and_fill_fieldPhone("5511912344321");
        samplePage.wait_and_fill_fieldUsername("tbasilio");
        samplePage.wait_and_fill_fieldPassword("Tbasilio123");
        samplePage.wait_and_fill_fieldConfirmPassword("Tbasilio123");
        samplePage.wait_and_fill_fieldComments("this is my first comment");
    }
}
