package entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UsedProduct extends Product{

    private LocalDate manufactureDate;

    public UsedProduct() {
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public String priceTags() {
        return getName()
                + "(Used) $"
                + String.format("%.2f", getPrice())
                + " (Manufacture date: "
                + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + ")";
    }
}
