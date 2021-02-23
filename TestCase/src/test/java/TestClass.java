import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestClass {

    @Test
    public void getCurrency(){
        RestAssured.baseURI="https://skyscanner-skyscanner-flight-search-v1.p.rapidapi.com/apiservices/reference/v1.0/currencies";
        Response response=null;
        try{
            response=RestAssured.given()
                    .header("x-rapidapi-key", "98d989ab10msh6046e420b738258p1a88a3jsn23da22bbb92f")
                    .header("x-rapidapi-host", "skyscanner-skyscanner-flight-search-v1.p.rapidapi.com")
                    .when()
                    .get();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Response:" +response.asString());
        System.out.println("Status code:"+response.getStatusCode());
        assertEquals(200, response.getStatusCode());
    }

    @Test
    public void getMarkets(){
        RestAssured.baseURI="https://skyscanner-skyscanner-flight-search-v1.p.rapidapi.com/apiservices/reference/v1.0/countries/en-US";
        Response response=null;
        try{
            response=RestAssured.given()
                    .header("x-rapidapi-key", "98d989ab10msh6046e420b738258p1a88a3jsn23da22bbb92f")
                    .header("x-rapidapi-host", "skyscanner-skyscanner-flight-search-v1.p.rapidapi.com")
                    .when()
                    .get();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Response:" +response.asString());
        System.out.println("Status code:"+response.getStatusCode());
        assertEquals(200, response.getStatusCode());
    }

    @Test
    public void getPlaces(){
        RestAssured.baseURI="https://skyscanner-skyscanner-flight-search-v1.p.rapidapi.com/apiservices/autosuggest/v1.0/UK/GBP/en-GB/?";
        Response response=null;
        try{
            response=RestAssured.given()
                    .queryParam("query", "Stockholm")
                    .header("x-rapidapi-key", "98d989ab10msh6046e420b738258p1a88a3jsn23da22bbb92f")
                    .header("x-rapidapi-host", "skyscanner-skyscanner-flight-search-v1.p.rapidapi.com")
                    .when()
                    .get();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Response:" +response.asString());
        System.out.println("Status code:"+response.getStatusCode());
        assertEquals(200, response.getStatusCode());
    }

    @Test
    public void getRoutes(){
        RestAssured.baseURI="https://skyscanner-skyscanner-flight-search-v1.p.rapidapi.com/apiservices/browseroutes/v1.0/US/USD/en-US/SFO-sky/ORD-sky/2021-09-01?inboundpartialdate=2019-12-01";
        Response response=null;
        try{
            response=RestAssured.given()
                    .header("x-rapidapi-key", "98d989ab10msh6046e420b738258p1a88a3jsn23da22bbb92f")
                    .header("x-rapidapi-host", "skyscanner-skyscanner-flight-search-v1.p.rapidapi.com")
                    .when()
                    .get();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Response:" +response.asString());
        System.out.println("Status code:"+response.getStatusCode());
        assertEquals(200, response.getStatusCode());
    }
}
