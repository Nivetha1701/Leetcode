import java.time.*;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate date=LocalDate.of(year,month,day);
        DayOfWeek d=date.getDayOfWeek();
        return capitalize(d.toString().toLowerCase());
    }
    public static String capitalize(String str){
        return str.substring(0,1).toUpperCase()+str.substring(1);
    }
}