package getRequest;

import org.testng.annotations.Test;
import io.restassured.response.ValidatableResponse;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;

public class GetBdd {
	
	@Test
	public void GetBDDRequest()
	{
		
		given()
		.when()
		      .get("https://jsonplaceholder.typicode.com/comments")
		.then()
		.statusCode(200);
		//.assertThat().body("id", contains("40"));
		//.assertThat().body("data.attributes.id", Matchers.equalTo("40"));
		 .assertThat().body("id", Is.is("40")).log().all();
		//System.out.println("Body is : " );
		
	    
		
		
	}

}
