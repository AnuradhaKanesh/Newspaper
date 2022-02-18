public class WeeklySubscription implements ISubscription{

    @Override
    public double getCurrentMonthTotalPriceForSubscription(Newspaper newspaper) {
        return new SubscriptionService().getSundaysPriceOfCurrentMonth(newspaper.getSundayPrice());
    }
}
