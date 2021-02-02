import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "년" + month + "월" + day + "일");

        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        System.out.println(hour + "시" + minute + "분" + second + "초");

        Calendar cal2 = Calendar.getInstance();

        cal2.set(2014, 11, 24);
        Date now = cal2.getTime();
        System.out.println(now);

        System.out.println("= 1일 후 =");
        cal2.add(Calendar.DATE, 1);
        System.out.println(cal2.getTime());
        System.out.println("= 6달 전 =");
        cal2.add(Calendar.MONTH, -6);
        System.out.println(cal2.getTime());
    }
    
}
