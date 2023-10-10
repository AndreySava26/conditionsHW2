import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        int x = 100;
        int deposit = 1100;
        int bonus;

        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int balance = x + deposit + bonus;
        System.out.println("На вашем балансе " + balance + " руб. Ваш бонус " + bonus + " руб.");

    }
}