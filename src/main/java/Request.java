import java.util.HashMap;

public class Request {

    public Integer duration;
    public Boolean urgency;
    public Integer timeConstraint;
    public Integer state;
    public String description;
    public Float price;
    public Integer payType;

    public Request(HashMap<String, String> reqDetails) {
        this.duration = Integer.parseInt(reqDetails.get("duration"));
        this.urgency = Boolean.parseBoolean(reqDetails.get("urgency"));
        this.timeConstraint = Integer.parseInt(reqDetails.get("timeConstraint"));
        this.state = Integer.parseInt(reqDetails.get("state"));
        this.description = reqDetails.get("description");
        this.price = Float.parseFloat(reqDetails.get("price"));
        this.payType = Integer.parseInt(reqDetails.get("payType"));
    }

    public Integer getRequestState() {
        return this.state;
    }

    public Boolean setRequestState(Integer state) {
        this.state = state;
        return true;
    }

    public Boolean makePayment() {
        return false;
    }
}
