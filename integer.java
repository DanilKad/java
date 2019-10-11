//6 Написать метод, которому в качестве параметра передается целое число, метод должен
//вернуть true, если число отрицательное;

public class integer {
   public static void main(String[] args){
       System.out.println(getPositiveNumber(-1));
       System.out.println(getPositiveNumber(-54));
       System.out.println(getPositiveNumber(55));
       System.out.println(getPositiveNumber(26));
}

    private static boolean getPositiveNumber(int i) {
       return (i < 0);
    }
}

