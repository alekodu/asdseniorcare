import java.util.HashMap;
import java.util.Map;

public class Login {

    public String email;
    public String password;

    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Integer signIn(){
        Map<String, String> user = new HashMap<String, String>();
        user.put("table", "user");
        user.put("email", this.email);
        user.put("password", this.password);
        DBAdaptor dbAdaptor = new DBAdaptor(null);

        return dbAdaptor.retrieve((HashMap<String, String>) user);
    }

    public Boolean signOut(){
        return true;
    }
}