import java.util.Map;
import java.util.HashMap;

public class FeedBackConf {
    public Boolean onTime;
    public Integer efficiency;
    public Integer politeness;
    public Boolean futureInteraction;
    public Boolean abuse;
    public String description;
    public Map<String, Boolean> enabler = new HashMap<String, Boolean>();

    public FeedBackConf(HashMap<String, Boolean> enabler) {
        this.enabler = enabler;
    }

    public Boolean setFeedbackConf(HashMap<String, String> opt) {
        this.onTime = Boolean.parseBoolean(opt.get("onTime"));
        this.efficiency = Integer.parseInt(opt.get("efficiency"));
        this.politeness = Integer.parseInt(opt.get("politeness"));
        this.futureInteraction = Boolean.parseBoolean(opt.get("futureInteraction"));
        this.abuse = Boolean.parseBoolean(opt.get("abuse"));
        this.description = opt.get("description");
        return true;
    }

    public FeedBackConf getFeedbackConf() {
        return this;
    }
}
