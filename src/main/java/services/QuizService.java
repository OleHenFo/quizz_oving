package services;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by olehe on 20-Sep-17.
 *
 */
@Path("/quiz")
public class QuizService {
    private Map<String,Quiz> quizMap = new HashMap<String, Quiz>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection getShit(){
        return quizMap.values();
    }

    @POST
    @Path("{quizName}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void newQuiz(Quiz quiz){
        quizMap.put(quiz.getName(),quiz);
    }
}
