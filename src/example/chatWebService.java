package example;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by 1494778 on 2016-03-07.
 */
@WebService()
public class chatWebService {
  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }
  public static void main(String[] argv) {
    Object implementor = new chatWebService ();
    String address = "http://localhost:9000/chatWebService";
    Endpoint.publish(address, implementor);
  }
}
