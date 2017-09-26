package services;

import java.util.ArrayList;

/**
 * Created by olehe on 20-Sep-17.
 *
 */

public class Quiz {
    private String name;
    private String start;
    private ArrayList<Question> questions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setQuestions(ArrayList<Question> questions){
        this.questions = questions;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void addQuestion(Question question){
        questions.add(question);
    }
}
