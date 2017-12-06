import java.util.ArrayList;
import java.util.List;

public class Responder extends User {
    GPSCoordinates currentLocation = new GPSCoordinates();
    List<Request> reqs = new ArrayList<Request>();

    public Responder(UserDB userDetails) {
        super(userDetails);
        this.currentLocation.setCurrentLocation(userDetails.lat, userDetails.lon);
    }

    public GPSCoordinates getCurrentLocation() {
        return this.currentLocation;
    }

    public Boolean receiveRequest(Request req) {
        this.reqs.add(req);
        return true;
    }

    public List<Request> checkRequests() {
        return this.reqs;
    }

    public Boolean acceptRequest(Requester user, Request req) {
        req.state = 1;
        Matcher matcher = Matcher.getMatcher();
        return matcher.receiveRequestConfirmation(user, this);
    }

    public Boolean declineRequest(Request req) {
        req.state = 2;
        return true;
    }

    public Boolean cancelRequest(Request req) {
        req.state = 3;
        return true;
    }

    public Boolean payment() {
        return true;
    }
}
