import java.util.List;

public class Learning {
    private static Learning learning = new Learning();

    private Learning() {
    }

    public static Learning getLearning() {
        return learning;
    }

    public User match(Request req) {
        // Mock-up match
        UserDB userDB = new UserDB();
        Responder user = new Responder(userDB);
        return user;
    }

    public User getUserDetails() {
        return null;
    }

    public void getUserPreferences() {
    }

    public List<Feedback> getUserFeedback() {
        return null;
    }
}
