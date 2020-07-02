Feature: Get test method with all logics

  Scenario: User calls web service test to check the logic with less than 10
    Given a test method request prepared with 9
    When a user retrieves the test method 
    Then the status code is 200
    And response includes this "Calling this method with param LessThan 10."

     Scenario: User calls web service test to check the logic with less than 50
    Given a test method request prepared with 49
    When a user retrieves the test method 
    Then the status code is 200
    And response includes this "Calling this method with param LessThan 50."
    
     Scenario: User calls web service test to check the logic with less than 100 
    Given a test method request prepared with 99
    When a user retrieves the test method 
    Then the status code is 200
    And response includes this "Calling this method with param LessThan 100."
    
     Scenario: User calls web service test to check the logic with less than 150 
    Given a test method request prepared with 149
    When a user retrieves the test method 
    Then the status code is 200
    And response includes this "Calling this method with param LessThan 150."
    
    Scenario: User calls web service test to check the logic with less than 200 
   Given a test method request prepared with 199
    When a user retrieves the test method 
    Then the status code is 200
    And response includes this "Calling this method with param LessThan 200."
    
    Scenario: User calls web service test to check the logic with less than 5 
     Given a test method request prepared with 1
    When a user retrieves the test method 
    Then the status code is 200
    And response includes this "Calling lowest number method."
    