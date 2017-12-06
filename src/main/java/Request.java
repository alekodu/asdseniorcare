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
        this.duration = reqDetails.get("duration");
        this.urgency = reqDetails.get("urgency");
        this.timeConstraint = reqDetails.get("timeConstraint");
        this.state = reqDetails.get("state");
        this.description = reqDetails.get("description");
        this.price = reqDetails.get("price");
        this.payType = reqDetails.get("payType");
    }

    public Integer getRequestState() {
        return this.state;
    }

    public Boolean setRequestState(Integer state) {
        this.state = state;
    }

    public Boolean makePayment() {
        return false;
    }
}
