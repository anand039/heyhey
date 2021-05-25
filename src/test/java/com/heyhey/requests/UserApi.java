package com.heyhey.requests;

import static com.heyhey.routes.Routes.USERS;
import static com.heyhey.routes.Routes.API;
import static com.heyhey.routes.Routes.BASE_PATH;

import io.restassured.response.Response;
import restClient.RestClient;

public class UserApi {

	public static Response postUser(Object requestPayload) {

		return RestClient.doPostRequest(API+BASE_PATH+USERS, requestPayload);

	}

	public static Response getUser() {

		return RestClient.doGetRequest(USERS);

	}
	
	public static Response updateUser(String playlistId, Object requestPayload) {

		return RestClient.doPutRequest(USERS + "/" + playlistId, requestPayload);

	}
}
