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
    private static Map<String,Quiz> quizMap = new HashMap<>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Quiz> getQuizzes(){
        return quizMap.values();
    }

    @GET
    @Path("/{quizName}")
    @Produces(MediaType.APPLICATION_JSON)
    public Quiz getQuiz(@PathParam("quizName") String n){
        return quizMap.get(n);
    }

    @PUT
    @Path("/{quizName}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addQuestion(@PathParam("quizName") String quizName, Question question){
        quizMap.get(quizName).addQuestion(question);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void newQuiz(Quiz quiz){
        quizMap.put(quiz.getName(),quiz);
    }

    @POST
    @Path("/{m}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void newQuiz(@PathParam("m") String m, Quiz quiz){
        quizMap.put(quiz.getName(),quiz);
    }
}