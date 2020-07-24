package sample;

/**
 * Class used tgo record the details of the tenant
 * @author Mogaka
 * @version 23rd April 2020
 */
public class Tenant {
    private String name;
    private int room;
    private PaymentList payments;
    public static final int MAX = 12;

    /**
     * Constructor initialises the name and the room number of the tenant
     * and sets the payments made to the empty list
     * @param nameIn: name of tenant
     * @param roomIn: room number of tenant
     */

    public Tenant(String nameIn, int roomIn) {
        name = nameIn;
        room = roomIn;
        payments = new PaymentList(MAX);
    }
    /**
     * Records a payment for the tenant
     * @param paymentIn: payment made by the tenant
     */
    public void makePayment (Payment paymentIn) {
        payments.addPayment(paymentIn);//call PaymentList method
    }
    /**
     * Reads the name of the tenant
     * @return Returns the name of the tenant
     */
    public String getName() {
        return name;
    }
    /**
     * Reads the room of the tenant
     * @returns Returns the room of the tenant
     */
    public int getRoom() {
        return room;
    }
    /**
     * Reads the payment of the tenant
     * @returns Returnd the payment made by the tenant
     */
    public PaymentList getPayments() {
        return payments;
    }
    @Override
    public String toString() {
        return name+", "+room+", "+payments;
    }
}
