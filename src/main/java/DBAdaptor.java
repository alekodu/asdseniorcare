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

            UserDB userDB = new UserDB();

            User user;
            if (userDB.type.equals("responder"))
                user = new Responder(userDB);
            else // requester
                user = new Requester(userDB);
            return user;
        } else {
            return 0;
        }
    }
}