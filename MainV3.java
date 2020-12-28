public class MainV3 {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1100;
        int bonus = refill / 100;
        int total = balance + refill + bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        System.out.println(total);
    }
}
