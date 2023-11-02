import java.time.*;

import javax.swing.text.DateFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class FormatingTimeAndDate {
    public static void main(String[] args) {
        LocalDateTime a = LocalDateTime.now();
        System.out.println("Before format "+a);
        DateTimeFormatter b = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate  = b.format(a);
        System.out.println("After formate "+formattedDate);
    }
}
