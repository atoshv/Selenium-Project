Feature: Login Feature


  Scenario Outline: Login Test Scenario

    Given user is already on Login Page
    When title of login page is QA Fake
    Then user enters "<username>" and "<password>"
    Then user checked remember me
    Then user clicks on login button
    Then user get the secret string on home screen
    Then Close the browser


    Examples:
      | username | password                                                                                                                                          |
      | admin    | pwd |
 