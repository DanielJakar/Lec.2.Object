package course.Daniel.Java;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Created by Jakars on 17/02/2017.
 */
public class DateUtils {
    // What is the date now:
    public static LocalDateTime now(){
        return LocalDateTime.now();
    }

    //How many years from now:
    public static long howManyYearsFromNow (LocalDateTime date){
        LocalDateTime now = LocalDateTime.now();
        Long years = now.until(date, ChronoUnit.YEARS);
        return years;
    }

    //How many years between two days:
    public static long differenceInYears (LocalDateTime from, LocalDateTime to){
        LocalDateTime now = LocalDateTime.now();
        return to.until(from, ChronoUnit.YEARS);

    }

    //input a date
    public static LocalDateTime getDate (String prompt){
        int year = IO.getInt("Enter the year: ", 1900,2200);
        int month = IO.getInt("Enter the month: ", 1,12);
        int day = IO.getInt("Enter the day: ", 1,31);

        return LocalDateTime.of(year,month,day,0,0);
    }





}
