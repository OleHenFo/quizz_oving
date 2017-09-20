package services;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by olehe on 20-Sep-17.
 *
 */

public class Quiz {
    private String name;
    private Date start;
    private ArrayList<Question> questions;
    private ArrayList<User> users;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public void addQuestion(Question q){
        questions.add(q);
    }

    public void addUser(User user){
        users.add(user);
    }
}
