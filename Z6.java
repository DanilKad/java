//6. Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
// checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance
// ([10, || 10]) → true, граница показана символами ||, эти символы в массив не входят;

public class Z6 {
public static void main(String[] args) {
        int[] test1 = {2, 1, 1, 2, 1};
        int[] test2 = {10, 10};
        int[] test3 = {1, 1, 1, 2, 1};

        System.out.println(checkMid(test1));
        System.out.println(checkMid(test2));
        System.out.println(checkMid(test3));

        }

private static boolean checkMid(int[] arrayToCheck) {
        int leftSum = 0;
        int rightSum = 0;
        boolean result = false;

        if (arrayToCheck.length > 1) {
            for (int i = 0; i < arrayToCheck.length / 2; i++) {
                leftSum += arrayToCheck[i];
                rightSum += arrayToCheck[arrayToCheck.length - 1 - i];

                if (i == (arrayToCheck.length / 2 - 1) && arrayToCheck.length % 2 != 0) {
                    rightSum += arrayToCheck[arrayToCheck.length - 2 - i];
                }
            }

            if (leftSum < rightSum) {
                for (int i = arrayToCheck.length / 2; i < arrayToCheck.length; i++){
                    leftSum += arrayToCheck[i];
                    rightSum -= arrayToCheck[i];

                    if (leftSum == rightSum) {
                        result = true;
                        printArray(arrayToCheck, i);
                        break;
                    }
                }
            }
            else if (leftSum > rightSum) {
                for (int i = arrayToCheck.length / 2; i < arrayToCheck.length; i++) {
                    leftSum -= arrayToCheck[i];
                    rightSum += arrayToCheck[i];

                }
                if (leftSum == rightSum) {
                    result = true;
                    printArray(arrayToCheck, arrayToCheck.length / 2 - 1);

                }
            }
            } else {
                System.err.println("Передан слишком короткий массив");
            }
            return result;
        }

        private static void printArray(int[] arrayToCheck, int middleIndex) {
            for (int i = 0; i < arrayToCheck.length; i++) {
                System.out.print(arrayToCheck[i] + " ");

                if(i == middleIndex)
                System.out.print("|| ");

            }
        }
    }
