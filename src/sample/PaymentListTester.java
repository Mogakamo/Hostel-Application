package sample;

import java.util.Scanner;

public class PaymentListTester {
    public static void main(String[] args) {
        char choice;
        int size;
        PaymentList list;//declares the paymentList test object
        Scanner keyboard = new Scanner(System.in);

        //get size of the list
        System.out.println("Size of the list? ");
        size = keyboard.nextInt();
        list = new PaymentList(size);//Create object to test
        //menu
        do {
//display options
            System.out.println();
            System.out.println("[1] ADD");
            System.out.println("[2] DISPLAY");
            System.out.println("[3] IS FULL");
            System.out.println("[4] GET PAYMENT");
            System.out.println("[5] GET TOTAL");
            System.out.println("[6] CALCULATE TOTAL PAID");
            System.out.println("[7] Quit");
            System.out.println();
            System.out.println("Enter a choice {1-7}: ");
            //get choice
            choice = keyboard.next().charAt(0);
            System.out.println();
            //process choice
            switch (choice) {
                case '1': option1(list); break;
                case '2': option2(list); break;
                case '3': option3(list); break;
                case '4': option4(list); break;
                case '5': option5(list); break;
                case '6': option6(list); break;
                case '7':
                    System.out.println("TESTING COMPLETE");
                    break;
            }
        } while (choice != '7');
    }
    
    //ADD
    static void option1(PaymentList listIn) {
        //prompt for payment details
        String month;
        double amount = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Month: ");
        month = keyboard.next();
        //create new object payment from input
        Payment p = new Payment(month, amount);
        //attempt to add payment to the list
        boolean ok = listIn.addPayment(p);
        if (!ok) {//Checks if the item was not added tgo the list
            System.out.println("ERROR: list full");
        }
    }
    //DISPLAY
    static void option2 (PaymentList listIn) {
        System.out.println("ITEMS ENTERED");
        System.out.println(listIn);//calls toString method of paymentList
    }
    //IS FULL
    static void option3 (PaymentList listIn) {
        if (listIn.isFull()) {
            System.out.println("List is full!");
        }
        else {
            System.out.println("List is NOT full!");
        }
    }
    //GET PAYMENT
    static void option4 (PaymentList listIn) {
        //prompt for and receive payment number
        System.out.println("Enter payment number to retreive: ");
        int num;
        Scanner keyboard = new Scanner(System.in);
        num = keyboard.nextInt();
        //retreive Payment object from the list
        Payment p = listIn.getPayment(num);//returns null if invalid position
        if (p != null) {
            System.out.println(p);//calls toString method of payment
        }
        else {
            System.out.println("INVALID PAYMENT NUMBER");//invalid position error
    }
}
  //GET TOTAL
    static void option5 (PaymentList listIn) {
        System.out.println("TOTAL NUMBER OF PAYMENTS ENTERED: ");
        System.out.println(listIn.getTotal());
    }
  //GET TOTAL PAID
    static void option6 (PaymentList listIn) {
        System.out.println("TOTAL PAYMENTS MADE SO FAR: ");
        System.out.println(listIn.calculateTotalPaid());
    }
}

