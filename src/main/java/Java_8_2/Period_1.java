package Java_8_2;

import java.time.*;


public class Period_1 {
    public static void main(String[] args) {
        LocalDate birthday=LocalDate.of(2003,5,28);
        LocalDate today=LocalDate.now();
        Period p=Period.between(birthday,today);
        System.out.printf("%d years % dmonth and %d days",p.getYears(),p.getMonths(),p.getDays());
        System.out.println();
        ZoneId zone=ZoneId.systemDefault();
        System.out.println(zone);
        ZonedDateTime dt=ZonedDateTime.now();
        System.out.println(dt);

    }
}
