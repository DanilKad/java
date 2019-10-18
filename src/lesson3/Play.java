
import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ИГРА Угадай число");
        int randNumber = 10;
        int number = (int) (Math.random() * randNumber);
        System.out.println("Угадай число от 0 до " + randNumber);
        int playerMove = scanner.nextInt();


        if (playerMove > number || playerMove < number) {
            for (int schetchik = 3; schetchik > 0; --schetchik) {
                if (playerMove > number) {
                    System.out.println("Ваше число больше загаданного Осталось попыток: " + schetchik);
                    Scanner newscannerT = new Scanner(System.in);
                    int scannerttwo = newscannerT.nextInt();
                    playerMove = scannerttwo;
                } else if (playerMove < number) {
                    System.out.println("Ваше число Меньше загаданного. Осталос попыток " + schetchik);
                    Scanner newscnnaerThr = new Scanner(System.in);
                    int newScannerThree = newscnnaerThr.nextInt();
                    playerMove = newScannerThree;
                }
            }
            if (playerMove == number) {
                System.out.println("Победа!");


            }
        }
        if (playerMove > number || playerMove < number) {
            System.out.println("Поражение!");
        }
    }
}