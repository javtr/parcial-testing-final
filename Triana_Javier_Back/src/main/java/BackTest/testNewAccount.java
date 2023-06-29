package BackTest;
import org.junit.Assert;
import org.junit.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class testNewAccount {
    String URL = "https://parabank.parasoft.com/parabank/services_proxy/bank/createAccount?customerId=27197&newAccountType=1&fromAccountId=40428";
    Response response =         given().auth()
            .basic("javierTriana789", "12345")
            .when()
            .post(URL);

    @Test
    public void test01() {
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());
    }

    @Test
    public void test02() {

                given().auth()
                .basic("usertest101", "12345")
                .when()
                .post("https://parabank.parasoft.com/parabank/services_proxy/bank/createAccount?customerId=27197&newAccountType=1&fromAccountId=40428")
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void test03() {

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
        System.out.println(statusCode);
    }


}