public class Location {
    private double latitude;
    private double longitude;

    public Location(double lat, double lon) {
        this.latitude = lat;
        this.longitude = lon;
    }

    public double distance(Location other) {
        double latDiff = Math.toRadians(latitude - other.latitude);
        double lonDiff = Math.toRadians(longitude - other.longitude);
        double a = Math.sin(latDiff / 2) * Math.sin(latDiff / 2)
                + Math.cos(Math.toRadians(latitude)) * Math.cos(Math.toRadians(other.latitude))
                * Math.sin(lonDiff / 2) * Math.sin(lonDiff / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return 6371 * c; // المسافة بالكيلومتر
    }

    public void printInfo() {
        System.out.println("Location: (" + latitude + ", " + longitude + ")");
    }
}