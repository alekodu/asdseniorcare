import java.util.HashMap;
import java.util.Map;

public class GPSCoordinates {
    public Map<String, Float> currentLocation = new HashMap<String, Float>();

    public Map<String, Float> getCurrentLocation() {
        return this.currentLocation;
    }

    public Boolean setCurrentLocation(Float lat, Float lon) {
        this.currentLocation.put("lat", lat);
        this.currentLocation.put("long", lon);
        return true;
    }
}
