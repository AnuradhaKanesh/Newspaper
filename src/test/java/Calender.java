import java.util.Calendar;
import java.util.Date;

public class Calender {
    public int getNumberOfDays(int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        Calendar.getInstance().set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), 1);

        int MaxDay = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
        int noOfDay = 0;

        for (int i = 1; i < MaxDay; i++) {
            calendar.set(Calendar.DAY_OF_MONTH, i);
            if (calendar.get(Calendar.DAY_OF_WEEK) == day)
                noOfDay++;
        }
        return noOfDay;
    }

    public int getWeekDays() {
        return Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH) - (
                getNumberOfDays(Calendar.SATURDAY) + getNumberOfDays(Calendar.SUNDAY));

    }
}
