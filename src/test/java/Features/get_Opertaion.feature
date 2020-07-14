Feature: TO PERFORM THE GET OPERTIONS

@GET
Scenario: User has to Validate the List of user API status Code
Given user enter the ReqRes baseURI and Content Type
When user enters the List of user endpoind with GET http request
Then user should get the 200

@PUT
Scenario: User has to Validate the Single user API status Code
Given user enter the ReqRes baseURI and Content Type
When user enters the Single user endpoind with GET http request
Then user should get the 200

@POST
Scenario: User has to create the Single user API status Code
Given user enter the ReqRes baseURI,Content Type and body
When user enters the create Single user endpoind with POST http request
Then user should get the 201