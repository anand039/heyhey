Feature: HeyHey Apis

	Background:
		Given user enter his details to create account
	
	Scenario:
		Create a user account
		
		When user submit the request to create account
		Then Account is created successfully
		