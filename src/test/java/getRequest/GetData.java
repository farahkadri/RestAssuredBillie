package getRequest;
import io.restassured.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;

public class GetData {
	
	@Test
	
	/*public void testResponsecode()
   {
	Response resp =RestAssured.get("https://jsonplaceholder.typicode.com/comments");
		int code =resp.getStatusCode();
		System.out.println("Status code is" +code);
		Assert.assertEquals(code, 200);
	}

	
	public void testRequest()
	{
		Response resp =RestAssured.get("https://jsonplaceholder.typicode.com/comments");
		String data =resp.asString();
		System.out.println("Comments are" +data);
		//	Assert.assertEquals(data.contains("40") , true /*Actual Value, "Response body contains 40");
	//	System.out.println("Comments are" +data.contains("pariatur aspernatur nam atque quis"));
	
	} */
	
	public void testid()
	{
		Response resp =RestAssured.get("https://jsonplaceholder.typicode.com/comments?id=40");
	    String data =resp.asString();
	   //Assert.assertEquals(data.contains(40, true ,resp.getBody());
	    JsonPath jsonPathEvaluator = resp.jsonPath();
	    String id = jsonPathEvaluator.get(“id”);
	    Assert.assertEquals(id, “40”);
	    System.out.println("Comments are" +data);
		
	    
	}
	
	
}
