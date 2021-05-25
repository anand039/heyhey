package com.heyhey.specs;


import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.with;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specifications {
	public static RequestSpecification getRequestSpecification() {

		return with().contentType(ContentType.JSON).headers("Api-Version", "application/vnd.heyhey.v1+json","App-Version","1.0.0","Connection","keep-alive").log().all();

	}

	public static ResponseSpecification getResponseSpecification() {

		return expect().log().all();

	}

}
