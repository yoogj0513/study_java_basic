package chap05;

import ex_enum.Week;

import java.util.Calendar;

public class EnumWeekExample {
    public static void main(String[] args) {
        Week today = null;                          // 열거 타입 변수 선언

        Calendar cal = Calendar.getInstance();      // Calendar 객체를 얻음
        int year    = cal.get(Calendar.YEAR);
        int month   = cal.get(Calendar.MONTH) + 1;
        int day     = cal.get(Calendar.DAY_OF_MONTH);
        int week    = cal.get(Calendar.DAY_OF_WEEK);   // 일(1) ~ 토(7)까지의 숫자를 리턴
        int hour    = cal.get(Calendar.HOUR);
        int minute  = cal.get(Calendar.MINUTE);
        int second  = cal.get(Calendar.SECOND);

        switch (week) {
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUEDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;
        }

        System.out.println("오늘 요일 : " + today);

        if(today == Week.SUNDAY) {
            System.out.println("일요일에는 축구를 합니다.");
        } else {
            System.out.println("열심히 자바 공부를 합니다.");
        }
    }
}
