package day10;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class TimeExam01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);

        System.out.println(LocalDateTime.now());

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        //포맷팅해서 날짜값 출력
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd hh:mm:ss z");
        System.out.println(now.format(formatter));

        ZonedDateTime nowInNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println("현재시각(뉴욕)"+nowInNewYork);

//        ZoneId.getAvailableZoneIds()
//                .stream()
//                .filter(zone -> zone.startsWith("Asia"))
//                .sorted()
//                .forEach(System.out::println);

       Set<String> zoneIds = ZoneId.getAvailableZoneIds();

       for (String zone:zoneIds){
           System.out.println(zone);
       }
    }
}
