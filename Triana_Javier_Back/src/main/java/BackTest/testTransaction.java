package BackTest;
import org.junit.Assert;
import org.junit.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class testTransaction {
    String URL = "https://parabank.parasoft.com/parabank/services_proxy/bank/accounts/40428/transactions";
    Response response =         given().auth()
            .basic("javierTriana789", "12345")
            .when()
            .get(URL);

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
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
        System.out.println(statusCode);
    }

}