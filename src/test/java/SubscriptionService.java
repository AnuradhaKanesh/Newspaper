import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class SubscriptionService {

    public double getWeekDaysPriceOfCurrentMonth(double weekdayPrice) {
        int noOfWeekDays = new Calender().getWeekDays();
        return noOfWeekDays * weekdayPrice;
    }

    public double getSundaysPriceOfCurrentMonth(double sundayPrice) {
        int noOfSundays = new Calender().getNumberOfDays(Calendar.SUNDAY);
        return noOfSundays * sundayPrice;
    }

    public double getSaturdaysPriceOfCurrentMonth(double saturdayPrice) {
        int noOfSaturdays = new Calender().getNumberOfDays(Calendar.SATURDAY);
        return noOfSaturdays * saturdayPrice;
    }

    public double getTotalPriceForAllNewspaperSubscribed(List<Newspaper> userNewspapers, ISubscription subscription) {
        double totalPrice =0;
        for (Newspaper newspaper : userNewspapers) {
            totalPrice +=subscription.getCurrentMonthTotalPriceForSubscription(newspaper);
        }
        return totalPrice;
    }
}
