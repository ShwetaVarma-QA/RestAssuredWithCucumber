Business Need: verification of the api working fine

  @EmployeeDetails
  Scenario: Employee details for a existing id
    Given  We have a employees added
    When  the get endpoint is used
    Then  details of employee with id "5" and status code 200 is received

  @EmployeeDetails
  Scenario: Employee details api with no id passed
    Given  a employee record is not added
    When  the get endpoint is used
    Then  status code 404 is received

  @AllEmployees
    Scenario: Employee details api
      Given  We have a employees added
      When  the get endpoint is used
      Then  details of employees with status code 200 is received

  @DeleteEmployee
  Scenario: deleting a existing employee
    Given a employee record is added
    When the delete endpoint is used
    Then the employee id "6" is deleted and response status code 200 is returned

  @DeleteEmployee
  Scenario: deleting a non-existing employee
    Given a employee record is not added
    When the delete endpoint is used
    Then the employee id "6787uh" is deleted and response status code 200 is returned

  @AddEmployee
  Scenario: adding a new employee
    Given the valid json is passed
    When the create endpoint is used
    Then response status code 200 is returned

  @UpdateEmployee
  Scenario: Updating a existing employee record
    Given a employee record is already added
    When the update endpoint is used
    Then the employee with id "4" is updated and response status code 200 is returned

  @UpdateEmployee
  Scenario: Updating a non-existing employee record
    Given a employee record is not added
    When the update endpoint is used
    Then the employee with id "63dssfsf99" is updated and response status code 200 is returned
