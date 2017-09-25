package services;

/**
 * Created by olehe on 20-Sep-17.
 *
 */
public class User {
    private String nick;
    private int score;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
