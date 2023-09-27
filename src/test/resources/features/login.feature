@Regression @login
Feature: crm app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed.

  Accounts are: helpdesk,hr,marketing


  @helpdesk
  Scenario: Login as website
    Given user is on the library login page
    When "helpdesk" enters helpdesk  username
    Then "helpdesk" enters helpdesk  password
    Then user click sing in button
    Then user should see the dashboard
    Then user close driver



  @hr
  Scenario: Login as website
    Given user is on the library login page
    Then "user" enters hr username
    And "user" enters hr  password
    Then user click sing in button
    Then user should see the dashboard
    Then user close driver


  @marketing
  Scenario: Login as website
    Given user is on the library login page
    Then "user" enters marketing  username
    And "user" enters marketing  password
    Then user click sing in button
    Then user should see the dashboard
    Then user close driver

