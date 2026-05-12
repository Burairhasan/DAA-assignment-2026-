public class Main {
    public static void main(String[] args) {
        int amount = 1988;
        int[] denominations = {5000, 1000, 500, 100, 50, 20, 10, 5, 2, 1};
        
        System.out.println("Amount: Rs. " + amount);
        System.out.println("Denominations required:");
        
        for (int denom : denominations) {
            if (amount >= denom) {
                int count = amount / denom;
                System.out.println(denom + " x " + count);
                amount = amount % denom;
            }
        }
    }
