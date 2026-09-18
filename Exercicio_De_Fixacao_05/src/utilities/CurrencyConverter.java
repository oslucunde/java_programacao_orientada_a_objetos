package utilities;

public class CurrencyConverter {

    private Double dollarprice;
    private Double amountindollar;
    private Double iofpercentage;

    public CurrencyConverter(Double dollarprice, Double amountindollar, Double iofpercentage) {
        this.dollarprice = dollarprice;
        this.amountindollar = amountindollar;
        this.iofpercentage = 0.06;
    }


    public double amountinReais() {
        return dollarprice * amountindollar;
    }

    public double taxValue() {
        return amountinReais() * iofpercentage;
    }

    public double amountinreaiswithTax() {
        return amountinReais() + taxValue();
    }
}
