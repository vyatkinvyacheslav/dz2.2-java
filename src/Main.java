// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int a = 200;//начальный баланс
        int b = 700; //сумма пополнения
        int x = b / 10;  //начиленный бонус
        int y;


        System.out.println("ваш начальный баланс" + " = " + a);
        System.out.println("сумма пополения" + " = " + b);


        if (b >= 1000) {
            System.out.println("ваш бонус" + " = " + x);
            y = a+b+x;
            System.out.println("ваш итоговый баланс" + " = " + y);

        } else {
            System.out.println("ваш бонус = 0");
            y = a+b;
            System.out.println("ваш итоговый баланс" + " = " + y);

        }



    }
}











