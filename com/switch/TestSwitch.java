//add code to test switch expression
https://docs.oracle.com/en/java/javase/21/language/pattern-matching.html#GUID-A59EF0C7-4CB7-4555-986D-0FD804555C25
public class TestSwitch {
    public static void main(String[] args) {
        String day = "MONDAY";

        String result = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };

        System.out.println(result);
    }



}