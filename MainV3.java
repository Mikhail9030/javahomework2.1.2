public class MainV3 {
    public static void main(String[] args) {
        boolean registered = true;
        int percent;
        if (registered) {
            percent = 10;
        } else {
            percent = 0;
        }
        int amount = 1100;
        int balance = 100;
        int bonus = balance + amount * percent / 100 / 100;
        if (amount > balance) {
            balance = bonus;
        }
        int total = amount + balance + percent;
        System.out.println(total);
    }
}
