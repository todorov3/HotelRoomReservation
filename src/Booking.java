import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Booking {
    private String username;
    private int roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private BigDecimal totalPrice;

    public Booking(String username, int roomNumber, String checkIn, String checkOut, BigDecimal pricePerNight) {
        this.username = username;
        this.roomNumber = roomNumber;
        this.checkIn = LocalDate.parse(checkIn, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.checkOut = LocalDate.parse(checkOut, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        long nights = ChronoUnit.DAYS.between(this.checkIn, this.checkOut);
        this.totalPrice = pricePerNight.multiply(BigDecimal.valueOf(nights));
    }
}
