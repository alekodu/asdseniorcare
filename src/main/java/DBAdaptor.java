import java.util.HashMap;
import java.util.Map;

public class DBAdaptor {

    public Map<String, String> dbConf = new HashMap<String, String>();

    public DBAdaptor(HashMap<String, String> dbConf) {
        this.dbConf = dbConf;
    }

    public static Boolean connect(){
        return true;
    }

    public Boolean store(HashMap<String, String> param){
        return true;
    }

    public Object retrieve(HashMap<String, String> param){
        if(param.get("table") == "user") {

            // Mocked-up user
            Map<String, String> user = new HashMap<String, String>();
            user.put("email", "group11asd@gmail.com");
            user.put("password", "123456");

            if (user.get("email").equals(param.get("email")) && user.get("password").equals(param.get("password"))) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}