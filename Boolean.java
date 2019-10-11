/**4. Написать метод, принимающий на вход два числа, и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false;
 */
 public class Boolean {
    public static void main(String[] args) {
        System.out.println(sumNumber(1, 6));
        System.out.println(sumNumber(11, 6));

    }

    private static boolean sumNumber(int a, int b) {
        return  ((a + b) >= 10 && (a + b) <= 20);
    }
}