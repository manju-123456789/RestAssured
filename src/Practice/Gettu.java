package Practice;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Gettu {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification a=RestAssured.given();
		Response b=a.request(Method.GET,"/api/users?page=2");
		System.out.println(b.asString());
		System.out.println(b.statusCode());

}
}
