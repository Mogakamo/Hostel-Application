package sample;

public class Payment {
    private String month;
    private double amount;

    /**
     * Constructor initialises the payment month and the amount paid
     * @param monthIn : month of payment
     * @param amountIn : amount of payment
     */
    public Payment(String monthIn, double amountIn) {
        month = monthIn;
        amount = amountIn;
    }
    /**
     * Reads the month for which payment was paid
     * @return Returns the month for which payment was made
     */
    public String getMonth() {
        return month;
    }
    /**
     * Reads the amount paid
     * @return Returns the amount paid
     */
    public double getAmount(){
        return amount;
    }

    @Override
    public String toString () {
        return "(" + "," + amount + ")";
    }
}
