# RestAssuredWithCucumber
## Project Details:
   
    Project is about automating APIs. I have used Rest Assured Automation using Cucumber framework
    
   * APIs which are automated can be found in 
    
    "src/dataToAutomate" folder
    
   * Cucumber scenarios are visible under 
    
    "src/resources/featureFiles/"  folder
    
   * Reports generated only after execution will be available at 
    
    "report" folder
    
   * All the variables (url in this case) are available at
   
   
      "/src/main/resources/testData.properties"
   
   
## Execution of Tests
### To run all scenarios use following command

       "./gradlew allScenarios"
### To run independent scenarios use following commands
* For executing scenarios of update call

       "./gradlew cucumber -P tags=@UpdateEmployee"
* For executing scenarios of delete call

       "./gradlew cucumber -P tags=@DeleteEmployee"

* For executing scenarios of post call

       "./gradlew cucumber -P tags=@AddEmployee"

* For executing scenarios of get call

       "./gradlew cucumber -P tags=@EmployeeDetails"
       "./gradlew cucumber -P tags=@AllEmployees"

## Jenkins File

Used Docker to run jenkins locally and configured the webhook url from git using ngrok

The build scheduled will run every 3 hours
