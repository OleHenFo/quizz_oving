package services;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by olehe on 20-Sep-17.
 *
 */
@Path("/users")
public class UserService {
    //private Map<String,User>

    @GET
    @Produces("text/plain")
    public String getUsers() {
        // Return some cliched textual content
        return "Hello World";
    }
}
