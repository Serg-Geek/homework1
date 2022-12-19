//Вывести все простые числа от 1 до 1000 (простые числа - это числа
//        которые делятся только на себя и на единицу
//        без остатка. Чтобы найти остаток от деления используйте оператор % ,
//        например 10%3 будет равно единице)


import java.util.ArrayList;

public class task3 {

        public static void main(String[] arg){
        ArrayList<Integer> res = ex3();
        System.out.println(res);
    }

    public static ArrayList<Integer> ex3(){
        int max = 1000;
        int j;
        ArrayList<Integer>  simple_num = new ArrayList<Integer>();
        for (int i = 2; i < max+1; i++) {
            for (j = 2; j <= i ; j++) {
                if (i%j==0) {
                    break;
                }
            }
            if(j==i){
                simple_num.add(i);
            }
        }
        return simple_num;
    }

}

