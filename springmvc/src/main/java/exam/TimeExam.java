package exam;

import com.fasterxml.jackson.datatype.jsr310.ser.ZonedDateTimeWithZoneIdSerializer;

import java.time.*;
import java.util.Set;

public class TimeExam {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalTime.now());

        LocalDate firstDate = LocalDate.of(2025,1,1);
        System.out.println(firstDate.plusDays(100));

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);


        System.out.println(ZonedDateTime.now(ZoneId.of("America/Belem")));

        Set<String> zoneIds =  ZoneId.getAvailableZoneIds();

        for(String zoneId : zoneIds){
            System.out.println(zoneId);
        }
    }
}
