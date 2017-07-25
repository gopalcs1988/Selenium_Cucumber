Feature: Test login into facebook application
	
		Scenario: Verify valid user login
		Given Open firefox browser and access the facebook application
		When Login with the valid "rajagopal1988@gmail.com" and "FILEhippo5503425"
		Then User should be able to access the home page of the application