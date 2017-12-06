import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.lang.*;

public abstract class User {
    private Integer userId;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String homeAddress;
    private Integer rating;
    private Integer state;

    public User(UserDB userDetails) {
        this.userId = userDetails.userId;
        this.name = userDetails.name;
        this.email = userDetails.email;
        this.password = userDetails.password;
        this.phoneNumber = userDetails.phoneNumber;
        this.homeAddress = userDetails.homeAddress;
        this.rating = userDetails.rating;
        this.state = userDetails.state;
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