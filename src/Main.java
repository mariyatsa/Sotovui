
public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenishment = 1100;

        int bonus;
        if (replenishment >= 1000) {
            bonus = replenishment / 100 * 1;
        } else {
            bonus = 0;
        }
        {
            int theAmout = replenishment + balance + bonus;

            System.out.println("Начислено рублей:" + bonus);
            System.out.println("Итоговый баланс на счету:" + theAmout);
        }
    }
}