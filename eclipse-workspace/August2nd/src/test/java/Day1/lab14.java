package Day1;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
//TimeZone
public class lab14 {

    public static void printDateTimeForZone(String zoneId) {
        try {
            ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(zoneId));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
            System.out.println("Current date and time in " + zoneId + ": " + zonedDateTime.format(formatter));
        } catch (Exception e) {
            System.out.println("Invalid Zone ID: " + zoneId);
        }
    }

    public static void main(String[] args) {
        // Test with different zone IDs
        printDateTimeForZone("America/New_York");
        printDateTimeForZone("Europe/London");
        printDateTimeForZone("Asia/Tokyo");
        printDateTimeForZone("US/Pacific");
        printDateTimeForZone("Africa/Cairo");
        printDateTimeForZone("Australia/Sydney");
    }
}
