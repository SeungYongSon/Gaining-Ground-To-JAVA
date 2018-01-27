package C7100210;

public class Location {

    String locationName;
    private double latitude;
    private double longitude;

    public Location(String locationName, double latitude, double longitude){
        this.locationName = locationName;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude(){
        return this.latitude;
    }

    public double getLongitude(){
        return this.longitude;
    }
}
