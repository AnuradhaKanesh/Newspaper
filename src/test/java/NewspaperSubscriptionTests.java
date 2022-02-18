import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class NewspaperSubscriptionTests {


    Newspaper hinduNewspaper = new Newspaper(AvailableNewspapers.Newspaper.Hindu, 2.5, 4.0, 4.0);
    Newspaper bmNewspaper = new Newspaper(AvailableNewspapers.Newspaper.BM, 1.5, 1.5, 1.5);
    Newspaper etNewspaper = new Newspaper(AvailableNewspapers.Newspaper.ET, 2, 2, 10);
    Newspaper htNewspaper = new Newspaper(AvailableNewspapers.Newspaper.HT, 2, 4, 4);
    Newspaper toiNewspaper = new Newspaper(AvailableNewspapers.Newspaper.ET, 3, 5, 6);

    @Test
    public void shouldGetCurrentMonthSubscriptionPrice() {
        User user = new User();
        List<Newspaper> userNewspapers = user.addNewspapers(hinduNewspaper, bmNewspaper, etNewspaper);
        ISubscription subscription = new MonthlySubscription();

        double priceForThisMonthSubscription = new SubscriptionService().getTotalPriceForAllNewspaperSubscribed(userNewspapers, subscription);

        Assert.assertEquals(priceForThisMonthSubscription, 212);
    }

    @Test
    public void shouldGetCurrentWeeklySubscriptionPrice() {
        User user = new User();
        List<Newspaper> userNewspapers = user.addNewspapers(hinduNewspaper, bmNewspaper, etNewspaper);
        ISubscription subscription = new WeeklySubscription();

        double priceForThisMonthSubscription = new SubscriptionService().getTotalPriceForAllNewspaperSubscribed(userNewspapers, subscription);

        Assert.assertEquals(priceForThisMonthSubscription, 62);
    }

    @Test
    public void shouldGetCurrentBiWeeklySubscriptionPrice() {
        User user = new User();
        List<Newspaper> userNewspapers = user.addNewspapers(hinduNewspaper, bmNewspaper, etNewspaper);
        ISubscription subscription = new BiWeeklySubscription();

        double priceForThisMonthSubscription = new SubscriptionService().getTotalPriceForAllNewspaperSubscribed(userNewspapers, subscription);

        Assert.assertEquals(priceForThisMonthSubscription, 86);
    }

}
