/**3. Написать метод, вычисляющий выражение a * (b + (c / d))
 *и возвращающий результат, где a, b, c, d – входные параметры этого метода;
 */
public class Methods {
    public static void main(String[] args) {


        System.out.println(division(2, 2, 5, 0));
        System.out.println(division(2.2, 3.0,4.7, 6.5));
    }

    private static int division(int a, int b, int c, int d) {
        int result = 0;
        if (d == 0) {
            System.err.println("На ноль делить нельзя");
        }
        else {
            result = a * (b + (c / d));
        }
        return result;
    }

 private static double division(double a, double b, double c, double d){
        return a * (b + (c / d));
    }

}
