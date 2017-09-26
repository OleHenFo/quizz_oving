package services;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by olehe on 26-Sep-17.
 *
 */
// The Java class will be hosted at the URI path "/helloworld"
@Path("/users")
public class UserService {
    static Map<String,ArrayList<String>> userMap = new HashMap<>(999);
    static Map<String,Integer> users = new HashMap<>(999);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<ArrayList<String>> getUserMap() {
        return userMap.values();
    }


    @GET
    @Path("/{quizName}")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<String> getUsers(@PathParam("quizName") String quiz) {
        return userMap.get(quiz);
    }

    @GET
    @Path("/score/{user}")
    @Produces(MediaType.APPLICATION_JSON)
    public int getUserScore(@PathParam("user") String user) {
        return users.get(user);
    }

    @POST
    @Path("/{quiz}")
    @Consumes(MediaType.TEXT_PLAIN)
    public void newUser(@PathParam("quiz") String quiz, String user){
        users.put(user,0);
        if (userMap.get(quiz)==null){
            userMap.put(quiz,new ArrayList<String>());
        }
        userMap.get(quiz).add(user);
    }
}