//5. Написать метод, которому в качестве параметра передается целое число, метод должен
//напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль
//считаем положительным числом.

public class Chislo {
    public static void main(String[] args){
        System.out.println(getPositiveOrNegative(0));
        System.out.println(getPositiveOrNegative(-1));
        System.out.println(getPositiveOrNegative(2));
}

    private static String getPositiveOrNegative(int i) {
        return  (i >= 0) ? "Число положительное" : "Число отрицательное";
    }
    }
