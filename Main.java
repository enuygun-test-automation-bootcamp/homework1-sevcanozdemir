public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.baseCalculator = new CashPayment();

        customerManager.doTheShopping();
    }
}