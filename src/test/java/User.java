import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {

    private String userName;
    List<Newspaper> newspaperList;

    public User() {
        newspaperList = new ArrayList<>();
    }
    public List<Newspaper> addNewspapers(Newspaper... newspaper)
    {
        this.newspaperList.addAll(Arrays.asList(newspaper));
        return this.newspaperList;
    }
}
