package util;

import java.time.LocalDate;

public class TimeUtil {
    public static boolean isThisDate(LocalDate localDate, LocalDate thisDate) {
        return localDate.isEqual(thisDate);
    }
}
