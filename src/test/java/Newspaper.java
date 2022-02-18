import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Getter
public class Newspaper {

    private AvailableNewspapers.Newspaper newspaperName;
    private double weekDayPrice;
    private double saturdayPrice;
    private double sundayPrice;


    public Newspaper(AvailableNewspapers.Newspaper newspaperName, double weekDayPrice, double saturdayPrice, double sundayPrice) {
        this.newspaperName = newspaperName;
        this.weekDayPrice = weekDayPrice;
        this.saturdayPrice = saturdayPrice;
        this.sundayPrice = sundayPrice;
    }

}
