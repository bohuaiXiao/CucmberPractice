Feature: Login
  # Agile story
  As user, I want to be able to login with username and password

  # Test = Test Case = Scenario
  # Test + DataProvider = Scenario Outline + Examples table
  Scenario: Login as sales manager and verify that title is Dashboard
    Given user is on the landing page
    When user logs is as a sales manager
    Then user should verify that title is a Dashboard

