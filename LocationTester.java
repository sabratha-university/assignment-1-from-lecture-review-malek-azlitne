public class LocationTester {
    public static void main(String[] args) {
        Location jamil = new Location(32.849, 11.866);
        Location sabrathaUniversity = new Location(32.793, 12.488);

        jamil.printInfo();
        sabrathaUniversity.printInfo();

        double dist = jamil.distance(sabrathaUniversity);
        System.out.println("المسافة بين الجميل وجامعة صبراتة: " + dist + " كم");
    }
}
