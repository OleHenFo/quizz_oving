package services;

/**
 * Created by olehe on 20-Sep-17.
 *
 */
public class Answer {
    private String answer;
    private boolean correct;

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public String getAnswer() {

        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
