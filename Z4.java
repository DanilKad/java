//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//        и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Z4 {
    public static void main(String[] args) {
      int  arr4 = 5;
      int [][] squareArray = new int [arr4][arr4];

        for (int i = 0; i < squareArray.length ; i++) {
            squareArray[i][i] = 1;
            squareArray[i][squareArray.length - i- 1] = 1;
            
        }
Util.printArray(squareArray);

    }
}