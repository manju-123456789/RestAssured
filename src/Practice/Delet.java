package Practice;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delet {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification a=RestAssured.given();
		Response b=a.request(Method.DELETE,"/api/users/2");
		System.out.println(b.asString());
		System.out.println(b.statusCode());
	}

}
