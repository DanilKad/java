//8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
//   Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

public class Year {
    public static void main(String[] args) {
        System.out.println(visYear(1900));
        System.out.println(visYear(1805));
        System.out.println(visYear(2020));
        System.out.println(visYear(2006));

    }

    private static boolean visYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }
}
