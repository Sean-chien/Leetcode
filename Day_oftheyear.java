import java.util.Calendar;
import java.util.Date;

public class Day_oftheyear {
    public static void main(String[] args) {
        Date today = new Date();
        Calendar time = Calendar.getInstance();
        time.setTime(today);
        int dayOfYear = time.get(Calendar.DAY_OF_YEAR);
        System.out.println(dayOfYear);

    }
}
