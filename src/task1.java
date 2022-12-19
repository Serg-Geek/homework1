//Вычислить n-ое треугольного число(сумма чисел от 1 до n)


import java.util.Scanner;

public class task1 {
    public static void main(String[] arg){
        int res = triangleNum();
        System.out.printf("Сумма треугольного числа равна: %d", res);
    }

    public static int triangleNum(){
        int res = 0;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число ");
        int num = iScanner.nextInt();
        for (int i = 1; i <= num; i++) {
            res += i;
    }
        return res;
    }
}
