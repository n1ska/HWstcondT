public class Main {
    public static void main(String[] args) {
        int x = 100; //баланс клиента
        int y = 2000; //пополнение

        if (y > 1000) {
            System.out.println("Баланс счета " + (y + x + y / 100));
        } else {
            System.out.println("Баланс счета " + (x + y));
        }
    }
}