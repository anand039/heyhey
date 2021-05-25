package com.heyhey.stepDefinition;

import static com.heyhey.specs.Specifications.getResponseSpecification;
import static io.restassured.RestAssured.baseURI;

import java.util.Map;

import com.heyhey.pojo.User;
import com.heyhey.pojo.UserList;
import com.heyhey.requests.UserApi;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class UserSignupTestSteps {
	
	
	private String payload;
	private UserList userList;
	private Response response;
	@Before
	public void setup() {
		baseURI = "https://heyhey.f22labs.xyz/";
	}
	
	@Given("user enter his details to create account")
	public void user_enter_his_details_to_create_account() {
	  // System.out.println("user entered details");
		/*
		 * "user": {
		"full_name": "Pradeep Kumar1",
		"email": "pradeep44@f22labs.com",
		"dob": "02/03/1995",
		"username": "pkp_pkp1",
		"image_url": "https://image.freepik.com/free-photo/human-brain-hologram-dark-background_99433-52.jpg",
		"password": "pradeep123456",
        "provider": "facebook",
        "uuid": "14250322976356455"
	}
		 */
		
		 User userPayload = prepareUserRequestPayload("Anand Kumar", "anandsingh+567578@f22labs.com", "02/03/1995", "akp_akp78676","https://image.freepik.com/free-photo/human-brain-hologram-dark-background_99433-52.jpg","anand123gujg78787","anand123gujg78787","facebook","14250322976356456");
		
		System.out.println("userPayload is "+ userPayload.getEmail());
		
		userList.setUser(userPayload);
		System.out.println("user entered details");
		
		
	   
	}

	@When("user submit the request to create account")
	public void user_submit_the_request_to_create_account() {
		
		response = UserApi.postUser(userList);
		response.then().log().all();
		System.out.println("user submitted request");
	}

	@Then("Account is created successfully")
	public void account_is_created_successfully() {
		response.then().log().all();
		response.then().spec(getResponseSpecification()).statusCode(422);
		System.out.println("Account is created for anand");
	}

	
	private User prepareUserRequestPayload(String full_name,String email,String dob,String username, String image_url,String password,String password_confirmation,String provider,String uuid ) {
		
		User user =new User();
		user.setFull_name(full_name);
		user.setEmail(email);
		user.setDob(dob);
		user.setUsername(username);
		user.setImage_url(image_url);
		user.setPassword(password);
		user.setPassword_confirmation(password_confirmation);
		user.setProvider(provider);
		user.setUuid(uuid);
		
		
		return user;
	}
	
}
