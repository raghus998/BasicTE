package Demo;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test {
	
public static void main(String[] args)
{
	Test s=new Test();
	s.ToGet();
}

public void ToGet()
{
	RestAssured.baseURI="https://reqres.in";
	given().
	
	param("page","2").and().
	when().
	get("/api/users").
	
	then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
	body("data[0].first_name",equalTo("Michael")).and().
	header("server","cloudflare");
	}
}
