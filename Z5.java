//5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

public class Z5 {
    public static void main(String[] args) {
        int[] arr5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        findMinMax(arr5);
}

    private static void findMinMax(int[] arr5) {
        int min = 0;
        int max = 0;

        for ( int i = 0; i < arr5.length; i++){
            if (i == 0){
                max = arr5[i];
                min = arr5[i];

            }
            else {
                max = (arr5[i] > max) ? arr5[i] : max;
                min = (arr5[i] < min) ? arr5[i] : min;
            }
        }
        System.out.println("Минимальный: " + min);
        System.out.println("Максимальный: " + max);
    }
    }
