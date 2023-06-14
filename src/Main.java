// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int start_balance = 54;//начальный баланс
        int refill = 1_200; //сумма пополнения
        int bonus = refill / 10;  //начиленный бонус
        int finish_balance;


        System.out.println("ваш начальный баланс" + " = " + start_balance);
        System.out.println("сумма пополения" + " = " + refill);


        if (refill >= 1000) {
            System.out.println("ваш бонус" + " = " + bonus);
            finish_balance = start_balance + refill + bonus;
            System.out.println("ваш итоговый баланс" + " = " + finish_balance);

        } else {
            System.out.println("ваш бонус = 0");
            finish_balance = start_balance + refill;
            System.out.println("ваш итоговый баланс" + " = " + finish_balance);

        }


    }
}











