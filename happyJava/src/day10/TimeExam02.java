package day10;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class TimeExam02 {
    public static void main(String[] args) {
        LocalTime start = LocalTime.of(9,0);
        LocalTime end = LocalTime.of(17,0);
        Duration duration = Duration.between(start,end);
        System.out.println(duration.toHours());

        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.now();

        Period period = Period.between(startDate, endDate);
        System.out.println("기간: " + period.getYears() + "년 " + period.getMonths() + "개월 " + period.getDays() + "일");
    }

}
