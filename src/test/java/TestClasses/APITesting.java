package TestClasses;

import com.fasterxml.jackson.core.type.TypeReference;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.example.Parent;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.Map;


import static org.hamcrest.MatcherAssert.assertThat;

public class APITesting {


    @Test
    public void testAPI() throws IOException {

        File file  =new File("");

        Parent parent = new Parent();


        RequestSpecification req = new RequestSpecBuilder().setContentType(ContentType.JSON).build();
        ResponseSpecification res = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();


        //List<Parent> list =
               //Response response =


        RestAssured.given().headers("Authorization","").formParams("attach",file).multiPart("ab",new File(""));


                       Response response  = RestAssured.given().spec(req)
                .baseUri("https://rahulshettyacademy.com")
                .queryParam("key", "qaclick123")
                .header("Content-Type","application/json")
                .body(parent)

                .when().get("").then().assertThat().
          body(JsonSchemaValidator.matchesJsonSchemaInClasspath("")).extract().response();



//                       spec(res).extract().response();
//
//



        //          body(JsonSchemaValidator.matchesJsonSchemaInClasspath(""));


//Type Ref
//                        as(new TypeRef<List<Parent>>() {
//                        })
                ;

//        String res = response.getBody().asString();
       //JsonPath json =  new JsonPath("")

        // ;

//
//
//        Map<String,String> map = new HashMap<>();


    }
}
