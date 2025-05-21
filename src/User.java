import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private List<Booking> bookingHistory;

    public User(String username, String password){
        this.username = username;
        this.password = password;
        this.bookingHistory = new ArrayList<>();
    }
}
