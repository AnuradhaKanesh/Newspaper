public class MonthlySubscription implements ISubscription {
    @Override
    public double getCurrentMonthTotalPriceForSubscription(Newspaper newspaper) {
        return new SubscriptionService().getWeekDaysPriceOfCurrentMonth(newspaper.getWeekDayPrice())
                + new SubscriptionService().getSaturdaysPriceOfCurrentMonth(newspaper.getSaturdayPrice())
                + new SubscriptionService().getSundaysPriceOfCurrentMonth(newspaper.getSundayPrice());
    }
}
