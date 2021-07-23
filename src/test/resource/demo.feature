Feature: Submit form data from Tricentis page
  Scenario: Submit all form data
    Given I am logged on SamplePage home
    And I fill in the Enter vehicle data form
    And Verify the vehicle field counter
    When Click on the next button
    Then Tab Enter insurant data is displayed

    And I fill in the Enter insurant data form
    And Verify the insurant field counter
    When Click on the next product button
    Then Tab Enter product data is displayed

    And I fill in the Enter product data form
    And Verify the product field counter
    When Click on the next select price option button
    Then Tab select price option is displayed

    And I select golg option
    And Verify the select price option field counter
    When Click on the next send quote button
    Then Tab send quote is displayed

    And I fill in the Send Quote data form
    And Verify the send quote field counter
    When Click on the send email button
    Then Verify success message



