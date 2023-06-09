public class Main {
    public static void main(String[] args) {

        int currentAccountBalance = 400;
        int entrance = 2000;

        int bonus;
        if (entrance > 1000) {
            bonus = entrance / 100;
        } else {
            bonus = 0;
        }

        int balance = currentAccountBalance + entrance + bonus;

        System.out.println("Баланс вашего счета " + balance + " руб.");

    }
}