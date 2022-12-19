//Реализовать простой калькулятор ("введите первое число"... "Введите второе число"... "
// укажите операцию, которую надо выполнить с этими числами"... "ответ: ...")


import java.util.Scanner;

public class task4 {

    public static void main(String[] arg){
        double res = calc();
        System.out.printf("ответ: %f", res);
    }

    public static double calc(){
        double res = 0;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число ");
        double x = iScanner.nextDouble();
        System.out.printf("Введите второе число ");
        double y = iScanner.nextDouble();
//        iScanner.close();
        System.out.printf("укажите операцию, которую надо выполнить с этими числами:" +
                "1 - сложение; " +
                "2 - вычитание; " +
                "3 - умножение; " +
                "4 - деление; " +
                "5 - возведение в степень.");
        int action = iScanner.nextInt();

        if (action == 1){
            res = x + y;
        }
        if (action == 2){
            res = x - y;
        }
        if (action == 3){
            res = x * y;
        }
        if (action == 4){
            res = x / y;
        }
        if (action == 5){
            res = Math.pow(x, y);
        }
    return res;
    }
}
