Feature: Test on Guru99 Application

  Scenario: Test contact information,mailing information
    Given user open guru99 register page url 
    Then user enter firstname and lastname ,phone and email
      | abc | xyz | 9999999999 | sneha@1325gmail.com |
    And Address,city, state, postalcode and country
      | pune | satara | mh | 12345 | INDIA |
    And user enter username, password and confirmpassword
      | senh12 | sneha@12 | sneha@12 |
