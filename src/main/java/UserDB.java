import java.util.HashMap;

public class UserDB {
    public Integer userId;
    public String name;
    public String email;
    public String password;
    public String phoneNumber;
    public String homeAddress;
    public Integer rating;
    public Integer state;
    public Float lat;
    public Float lon;
    public String type;

    public UserDB() {
        // Mock-up user
        this.userId = 11;
        this.name = "Group Eleven";
        this.email = "group11asd@gmail.com";
        this.password = "123456";
        this.phoneNumber = "0000000";
        this.homeAddress = "Polacksbacken";
        this.rating = 10;
        this.state = 1;
        this.lat = 124.88f;
        this.lon = 88.60f;
        this.type = "responder";
    }

    public Boolean insert(Object user) {
        return true;
    }

    public UserDB select(HashMap param) {
        return this;
    }
}