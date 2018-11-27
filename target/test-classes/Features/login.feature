
  @sanity
  Feature: Account Management

    Scenario: Account Login
      Given user on homepage
      When user click login
      When user enter "tester" as firstname and "tester123" as password
      