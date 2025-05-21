import java.math.BigDecimal;

public class Room {
    private int number;
    private String type;
    private BigDecimal price;
    private BigDecimal cancelationFee;
    private boolean isAvailable;

    public Room(int number, String type, BigDecimal price, BigDecimal cancelationFee, boolean isAvailable) {
        this.number = number;
        this.type = type;
        this.price = price;
        this.cancelationFee = cancelationFee;
        this.isAvailable = isAvailable;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getCancelationFee() {
        return cancelationFee;
    }

    public void setCancelationFee(BigDecimal cancelationFee) {
        this.cancelationFee = cancelationFee;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
