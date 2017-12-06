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

            // Mock-up user
            Map<String, String> userDB = new HashMap<String, String>();
            userDB.put("userId", "11");
            userDB.put("name", "Group Eleven");
            userDB.put("email", "group11asd@gmail.com");
            userDB.put("password", "123456");
            userDB.put("phoneNumber", "0000000");
            userDB.put("homeAddress", "Polacksbacken");
            userDB.put("rating", "10");
            userDB.put("state", "1");
            userDB.put("lat", "124.88");
            userDB.put("lon", "88.60");
            userDB.put("type", "responder");

            User user;
            if (userDB.get("type").equals("responder"))
                user = new Responder((HashMap<String, String>) userDB);
            else //(userDB.get("type").equals("requester"))
                user = new Requester((HashMap<String, String>) userDB);

            if (user.getUserDetails().get("email").equals(param.get("email")) &&
                    user.getUserDetails().get("password").equals(param.get("password"))) {
                return user;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}