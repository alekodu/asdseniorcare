public class Matcher {

    public Integer matchStrategy;
    public Integer matchMethod;

    private static Matcher matcher = new Matcher();

    private Matcher() {
    }

    public static Matcher getMatcher() {
        return matcher;
    }

    public Boolean receiveRequest(Request req) {
        sendRequest(findUserMatch(req));
        return true;
    }

    public User findUserMatch(Request req) {
        Learning learning = Learning.getLearning();
        return learning.match(req);
    }

    public Boolean sendRequest(User user) {
        return true;
    }

    public Boolean receiveRequestConfirmation(User user) {
        return true;
    }

    public Boolean sendRequestConfirmation(User user) {
        return true;
    }

    public Boolean manageRequestCancelation(Request req) {
        return true;
    }

    public Boolean scheduleFeedback(Request req) {
        return true;
    }

    public Boolean askFeedback(Request req) {
        return true;
    }

    public Boolean receiveFeedback(Feedback fb) {
        return true;
    }

    public Boolean recordUsageStats() {
        return true;
    }
}
