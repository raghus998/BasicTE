package Demo;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Teat1 {
	@Test
	public void GetM()
	{
		RestAssured.baseURI="https://reqres.in";
		given().
		
		param("page","2").and().
		when().
		get("/api/users").
		
		then().assertThat().statusCode(400).and().contentType(ContentType.JSON).and().
		body("data[0].first_name",equalTo("Michael")).and().
		header("server","cloudflare");
		}

}
