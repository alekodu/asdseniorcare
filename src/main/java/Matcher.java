public class Matcher {

    public Integer matchStrategy;
    public Integer matchMethod;

    private static Matcher matcher = new Matcher();

    private Matcher() {
    }

    public static Matcher getMatcher() {
        return matcher;
    }

    public Boolean receiveRequest(Request req, Requester user) {
        return sendRequest(findUserMatch(req), user, req);
    }

    public Responder findUserMatch(Request req) {
        Learning learning = Learning.getLearning();
        return learning.match(req);
    }

    public Boolean sendRequest(Responder respUser, Requester reqUser, Request req) {
        // Responder positive reply mock-up
        return respUser.acceptRequest(reqUser, req);
    }

    public Boolean receiveRequestConfirmation(Requester reqUser, Responder respUser) {
        return sendRequestConfirmation(reqUser);
    }

    public Boolean sendRequestConfirmation(Requester user) {
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
