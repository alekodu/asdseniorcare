import java.util.HashMap;

public class Feedback {

    public FeedBackConf opt = new FeedBackConf(null);

    public Feedback(HashMap<String, String> fbDetails) {
        this.opt.setFeedbackConf(fbDetails);
    }

    public Boolean generateFeedback() {
        return true;
    }

    public Boolean setFeedback(HashMap opt) {
        return true;
    }
}
