package Client;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;



public class RestClient {

	public Response SendGetRequest(String uri) {
		return given().when().get();
		
	}
	public Response SendPostRequest(String uri,Object payLoad) {
		return given().contentType(ContentType.JSON).body(payLoad).post();				
}
}
