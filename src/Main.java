public class Main {
    public static void main(String[] args) {
        int balance = 100; //баланс клиента
        int amount = 2000; //пополнение

        if (amount > 1000) {
            System.out.println("Баланс счета " + (amount + balance + amount / 100));
        } else {
            System.out.println("Баланс счета " + (balance + amount));
        }
    }
}