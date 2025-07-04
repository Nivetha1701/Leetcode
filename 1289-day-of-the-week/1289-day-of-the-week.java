import java.util.Calendar;
class Solution {
    public String dayOfTheWeek(int day,int month,int year){
        Calendar cal=Calendar.getInstance();
        cal.set(year,month-1,day);
        int dayIndex=cal.get(Calendar.DAY_OF_WEEK);
        String days[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        return days[dayIndex-1];
    }
}


// import java.time.*;

// class Solution {
//     public String dayOfTheWeek(int day, int month, int year) {
//         LocalDate date=LocalDate.of(year,month,day);
//         DayOfWeek d=date.getDayOfWeek();
//         return capitalize(d.toString().toLowerCase());
//     }
//     public static String capitalize(String str){
//         return str.substring(0,1).toUpperCase()+str.substring(1);
//     }
// }