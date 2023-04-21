package Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Server.RestServer;
import io.restassured.RestAssured;

//import static io.restassured.RestAssured.*;
 

public class ProductTest {

	RestServer restServer;
	
	@BeforeClass
	
	public void setUp() {
		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1";
		RestAssured.basePath = "/employees";
		restServer = new RestServer();
	}
	@Test
	public void verifyGetReq() {
		restServer.getAllProd().then().log().all().statusCode(200);
	}	/*public void verifyPostReq() {
		restServer.addProd("/public/v2/users").then().statusCode(204);
}*/
}

