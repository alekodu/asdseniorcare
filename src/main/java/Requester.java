import java.util.HashMap;

public class Requester extends User {

    public Request req;

    public Requester(HashMap<String, String> userDetails) {
        super(userDetails);
    }

    public Request createRequest(HashMap<String, String> reqDetails) {
        this.req = new Request(reqDetails);
        return this.req;
    }

    public Boolean issueRequest() {
        return true;
    }

    public Boolean receiveRequestConfirmation(Request req) {
        return true;
    }

    public Boolean cancelRequest(Request req) {
        this.req.state = 4;
        return true;
    }

    public Request monitorRequest() {
        return this.req;
    }

    public Boolean payment() {
        return true;
    }
}
