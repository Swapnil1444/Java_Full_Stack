import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloService
{
    @WebMethod
    public String message()
    {
        return "Welcome to Java Web Service";
    }
}