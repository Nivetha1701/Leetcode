class Solution {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        int days = day;

        switch (month - 1) {
            case 11: days += 30;
            case 10: days += 31;
            case 9:  days += 30;
            case 8:  days += 31;
            case 7:  days += 31;
            case 6:  days += 30;
            case 5:  days += 31;
            case 4:  days += 30;
            case 3:  days += 31;
            case 2:  days += isLeapYear(year) ? 29 : 28;
            case 1:  days += 31;
            default: break;
        }

        return days;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
