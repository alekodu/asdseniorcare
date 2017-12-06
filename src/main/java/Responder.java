import java.util.HashMap;

public class Responder extends User {
    GPSCoordinates currentLocation = new GPSCoordinates();

    public Responder(HashMap<String, String> userDetails) {
        super(userDetails);
        this.currentLocation.setCurrentLocation(Float.parseFloat(userDetails.get("lat")),
                Float.parseFloat(userDetails.get("lon")));
    }

    public Boolean payment() {
        return true;
    }
}
