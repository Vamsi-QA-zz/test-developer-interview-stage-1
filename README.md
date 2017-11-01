
To verify the tests.
 
The following changes were made to implement the required tasks.
      1. The two example scenarios in the search feature were failing as they were asserting on options which no longer exist on the home page hence I updated them which now pass.
        Also, implemented the remaining WIP scenarios using a page object pattern.
      2. I have moved the Screenplay Scenario into a new feature file so that I could refactor the existing Search feature using the 'Background'option.
      3. I have created a new feature to test the APIs. This uses the SerenityRest which provides the integration with RestAssured.
        This APIs test adds value by cutting down the need to write more UI specific tests such as userlogin,product availability,shopping cart,etc.
      4. Added page objects to the MainSearch page to implement the WIP scenarios.
      5. I used Java 9 to work on this project hence I updated the dependencies accordingly in the gradle.build file

       Alls the commands which were mentioned in the readme file can be used to run the tests.
       To run all tests, run the command below:

      `$ gradle clean test aggregate`

     View the report at target/site/serenity/index.html
