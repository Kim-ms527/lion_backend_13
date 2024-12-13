package day10;

import day08.Cal;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExam {
    public static void main(String[] args) {
        Date myBirthday = new Date(2010,1,1);
        System.out.println(myBirthday);

        Date now = new Date();
        System.out.println(now);

        System.out.println(now.after(myBirthday));
        System.out.println(myBirthday.after(now));

        System.out.println(now.getDate());

        //이렇게 자식으로 생성했을때와
        Calendar calendar2 = new GregorianCalendar();  //이렇게 사용하지는 않아요..

        //이렇게 생성했을때 어떤 차이가 있을까요?
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.MONTH)+1);  //월 0월 11월   월은 + 1

//2000.4.12   일 셋한다라고 했을때
        calendar.set(2024, 11, 13);  //월은 항상 + 1 로 생각해요^^
        System.out.println(calendar.get(Calendar.YEAR));

        System.out.println(calendar.getActualMaximum(Calendar.DATE));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        //달력을 출력할 수 있을거예요.

    }
}
