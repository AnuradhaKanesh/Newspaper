public class BiWeeklySubscription implements ISubscription {
    @Override
    public double getCurrentMonthTotalPriceForSubscription(Newspaper newspaper) {
        return new SubscriptionService().getSaturdaysPriceOfCurrentMonth(newspaper.getWeekDayPrice())
                + new SubscriptionService().getSundaysPriceOfCurrentMonth(newspaper.getSundayPrice());
    }
}
