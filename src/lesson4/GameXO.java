import java.util.Random;
import java.util.Scanner;

public class GameXO {

    static final int SIZE = 3;
    static final int DOTS_TO_WIN = 3;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWinLines(DOT_X)) {
                System.out.println("You winner!!!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья!");
                break;
            }

            aiTurn();
            printMap();
            if (checkWinLines(DOT_O)) {
                System.out.println("Computer winner!!!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья!");
                break;
            }
        }

    }

    static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void humanTurn() {
        int x, y;
        do {
            System.out.println("input koord X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));

        map[y][x] = DOT_X;
    }

    static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    static void aiTurn() {
        int x = -1;
        int y = -1;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(isCellValid(i,j)){
                    map[i][j] = DOT_X;
                    if (checkWinLines(DOT_X)){
                        y = i;
                        x = j;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        if (x == -1 || y == -1) {
            do {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            } while (!isCellValid(y, x));
        }

        map[y][x] = DOT_O;
    }

    static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean checkWin(char dot) {
        if (map[0][0] == dot && map[0][1] == dot && map[0][2] == dot) {
            return true;
        }
        if (map[1][0] == dot && map[1][1] == dot && map[1][2] == dot) {
            return true;
        }
        if (map[2][0] == dot && map[2][1] == dot && map[2][2] == dot) {
            return true;
        }

        if (map[0][0] == dot && map[1][0] == dot && map[2][0] == dot) {
            return true;
        }
        if (map[0][1] == dot && map[1][1] == dot && map[2][1] == dot) {
            return true;
        }
        if (map[0][2] == dot && map[1][2] == dot && map[2][2] == dot) {
            return true;
        }

        if (map[0][0] == dot && map[1][1] == dot && map[2][2] == dot) {
            return true;
        }
        if (map[0][2] == dot && map[1][1] == dot && map[2][0] == dot) {
            return true;
        }

        return false;
    }

    static boolean checkLine(int cy, int cx, int vy, int vx, char dot) {
        if (cx + vx * DOTS_TO_WIN - 1 > SIZE - 1 || cy + vy * DOTS_TO_WIN - 1 > SIZE - 1 ||
                cy + vy * DOTS_TO_WIN - 1 < 0) {
            return false;
        }

        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[cy + i * vy][cx + i * vx] != dot) {
                return false;
            }
        }
        return true;
    }

    static boolean checkWinLines(char dot) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (checkLine(i, j, 0, 1, dot) || checkLine(i, j, 1, 0, dot) ||
                        checkLine(i, j, 1, 1, dot) || checkLine(i, j, -1, 1, dot)) {
                    return true;
                }
            }
        }
        return false;
    }

}
