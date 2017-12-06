import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.lang.*;

public abstract class User {
    public Integer userId;
    public String name;
    public String email;
    public String password;
    public String phoneNumber;
    public String homeAddress;
    public Integer rating;
    public Integer state;

    public User(HashMap<String, String> userDetails) {
        this.userId = Integer.parseInt(userDetails.get("userId"));
        this.name = userDetails.get("name");
        this.email = userDetails.get("email");
        this.password = userDetails.get("password");
        this.phoneNumber = userDetails.get("phoneNumber");
        this.homeAddress = userDetails.get("homeAddress");
        this.rating = Integer.parseInt(userDetails.get("rating"));
        this.state = Integer.parseInt(userDetails.get("state"));
    }

    public Map<String, String> getUserDetails() {
        Map<String, String> userDetails = new HashMap<String, String>();

        userDetails.put("userId", Integer.toString(this.userId));
        userDetails.put("name", this.name);
        userDetails.put("email", this.email);
        userDetails.put("password", this.password);
        userDetails.put("phoneNumber", this.phoneNumber);
        userDetails.put("homeAddress", this.homeAddress);
        userDetails.put("rating", Integer.toString(this.rating));
        userDetails.put("state", Integer.toString(this.state));

        return userDetails;
    }

    public Boolean setUserDetails() {
        return true;
    }

    public Boolean setUserPreferences() {
        return true;
    }

    public Boolean manageAccount() {
        return true;
    }

    public Boolean receiveFeedbackRequest(Request req) {
        return true;
    }

    public Boolean giveFeedback(Request req) {
        return true;
    }

    public List<Request> getRequestHistory() {
        return null;
    }

    public abstract Boolean payment();
}