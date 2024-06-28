Feature: JobSearch Result
  As a user i want to test different components in job search result tab

  @sanity
  Scenario Outline: verify job search result using different data set
  Given:User is on home page
    When I enter job "<jobTitle>"
    And  I accept cookies
    And I enter location "<location>"
    And I select  distance"<distance>"
    And I click on more search option link
    And I enter min salary"<salaryMin>"
    And I enter max salary"<salaryMax>"
    And I select salary type "<salaryType>"
    And I select job type "<jobType>"
    And I click on find jobs button
    Then I verify result "<result>"
    Examples:
      | jobTitle           | location     | distance | salaryMin | salaryMax | salaryType | jobType   | result                                          |
      | Tester             | Harrow       | 5 miles  | 30000     | 500000    | Per annum  | Permanent | Permanent Tester jobs in Harrow                 |
      | Admin              | Hounslow     | 10 miles | 30000     | 40000     | Per month  | Contract  | Admin job in Hounslow                           |
      | Customer Assistant | Hayes        | 15 miles | 500       | 1000      | Per week   | Temporary | Customer Assistant jobs in Hayes                |
      | Finance            | London       | 25 miles | 40000     | 60000     | Per month  | Permanent | Finance job in London                           |
      | business Analyst   | South London | 15 miles | 50000     | 100000    | Per annum  | Permanent | Permanent Business Analyst jobs in South London |
      | Java Developer     | London       | 7 miles  | 30000     | 800000    | Per annum  | Permanent | Permanent Java Developer jobs in London         |