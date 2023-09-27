@SCRUM-1266
Feature: crm app access search data
  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And user can display group

  Accounts are: helpdesk,hr,marketing


   Background:
  Given user is on the library login page
  When "user" enters helpdesk  username
  Then "user" enters helpdesk  password
  Then user click sing in button
  Then user should see the dashboard




  @SCRUM-1263
  Scenario: user find conversation page
    Given user should see the dashboard
    Then user click hamburger menu
    Then user can click conversation button
    Then user see conversation title



  @SCRUM-1264
  Scenario:find search bar
    Given user see conversation tit
    When user click search bar top the page





  @SCRUM-1265
  Scenario:access search data
   Given user click search bar top the pages
    When user types "Group"
    Then user click their group







