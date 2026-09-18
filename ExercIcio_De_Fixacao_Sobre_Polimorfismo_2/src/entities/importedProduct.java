package entities;

import java.time.format.DateTimeFormatter;

public class importedProduct extends Product {

    private Double customsFee;

    public importedProduct() {
    }

    public importedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public double totalPrice() {
        return getPrice() + customsFee;
    }

    @Override
    public String priceTags() {
        return getName()
                + " $"
                + String.format("%.2f", totalPrice())
                + " (Customs fee: $"
                + String.format("%.2f", customsFee)
                + ")";
    }
}
