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
    @Path("/{quizName_stamp}")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<String> getUsers(@PathParam("quizName_stamp") String quiz) {
        return userMap.get(quiz);
    }

    @GET
    @Path("/score/{user}/{quizName_stamp}")
    @Produces(MediaType.APPLICATION_JSON)
    public int getUserScore(@PathParam("user") String user,@PathParam("quizName_stamp") String quiz) {
        return users.get(user+quiz);
    }

    @PUT
    @Path("/{user}/{quizName_stamp}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addScore(@PathParam("user") String user,@PathParam("quizName_stamp") String quiz,int score){
        users.put(user+quiz,users.get(user+quiz)+score);
    }

    @POST
    @Path("/{quizName_stamp}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void newUser(@PathParam("quizName_stamp") String quiz, String user){
        if (!users.containsKey(user+quiz)){
            users.put(user+quiz,0);
        }
        if (userMap.get(quiz)==null){
            userMap.put(quiz,new ArrayList<String>());
        }
        userMap.get(quiz).add(user);
    }
}
