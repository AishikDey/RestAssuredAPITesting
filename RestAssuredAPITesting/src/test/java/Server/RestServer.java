package Server;

import Client.RestClient;
import io.restassured.response.Response;

public class RestServer {
	RestClient restClient;
	
public RestServer() {
	restClient = new RestClient();
}
	
	public Response getAllProd() {
		return restClient.SendGetRequest("/employees");
	}
	/*public Response addProd(String payLoad) {
		return restClient.SendPostRequest("/products",payLoad);
	}*/

}
