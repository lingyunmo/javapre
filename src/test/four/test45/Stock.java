package test.four.test45;

public class Stock {
    String symbol;
    String name;
    double previousPrice;
    double currentPrice;

    Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    double getChangePercent() {
        return (currentPrice - previousPrice) / previousPrice * 100;
    }

    public static void main(String[] args) {
        Stock s = new Stock("浦发银行", "600000");
        s.previousPrice = 25.5;
        s.currentPrice = 28.6;
        System.out.println(s.getChangePercent());
    }
}
