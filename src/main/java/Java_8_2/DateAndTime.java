package Java_8_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class DateAndTime {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println(date);
        int dd= date.getDayOfMonth();
        int mm=date.getMonthValue();
        int yy=date.getYear();
        System.out.println(dd + " " + mm + " "+yy);
        System.out.println(mm + " "+dd+ " "+yy);
        System.out.printf("%d-%d-%d",yy,mm,dd);
        LocalTime time=LocalTime.now();
        System.out.println(time);

        int  min=time.getMinute();
        System.out.println(min);

        int sec=time.getSecond();
        System.out.println(sec);

        double nano=time.getNano();
        System.out.println(nano);
        System.out.printf("%d-%d-%f",min,sec,nano);
    }

}
