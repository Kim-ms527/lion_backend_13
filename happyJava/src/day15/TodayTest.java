package day15;

public class TodayTest {
    public static void main(String[] args) {
        Today2 today2 = new Today2();
        today2.set요일("월요일");

        today2.set요일("월월일");  // 오류를 발생시키지 않아요!!




        Today today = new Today();
        today.setDay(Day.SUNDAY);
        System.out.println(today.getDay().ordinal());  //0
        System.out.println(today.getDay());

        today.setDay(Day.THURSDAY);
        System.out.println(today.getDay().ordinal());  // 4



        for(Day day : Day.values()){
            System.out.println(day);
        }




        switch (today.getDay()){
            case FRIDAY :
                System.out.println();
                break;
            case MONDAY :
                System.out.println();
                break;
        }
    }
}
