//Вычислить n! (произведение чисел от 1 до n)


public class task2 {
    public static void main(String[] arg){
        int res = Factorial(5);
        System.out.println(res);

    }
    public static  int  Factorial(int num){
        if (num < 2) return 1;
        int res = num * Factorial(num-1);

        return res;
    }

}


