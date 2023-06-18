// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int startBalance = 54;//начальный баланс
        int refill = 1_200; //сумма пополнения
        int bonus = refill / 10;  //начиленный бонус
        int finishBalance;


        System.out.println("ваш начальный баланс" + " = " + startBalance);
        System.out.println("сумма пополения" + " = " + refill);


        if (refill >= 1000) {
            System.out.println("ваш бонус" + " = " + bonus);
            finishBalance = startBalance + refill + bonus;
            System.out.println("ваш итоговый баланс" + " = " + finishBalance);

        } else {
            System.out.println("ваш бонус = 0");
            finishBalance = startBalance + refill;
            System.out.println("ваш итоговый баланс" + " = " + finishBalance);

        }


    }
}











