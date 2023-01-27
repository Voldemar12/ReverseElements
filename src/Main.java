import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] twoDimArray = {
                {0, 0, 9, 9},
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length / 2; j++) {
                twoDimArray[i][twoDimArray[i].length - 1 - j] += twoDimArray[i][j];
                twoDimArray[i][j] = twoDimArray[i][twoDimArray[i].length - 1 - j] - twoDimArray[i][j];
                twoDimArray[i][twoDimArray[i].length - 1 - j] -= twoDimArray[i][j];
            }
        }

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray.length; j++) {
                System.out.print(twoDimArray[i][j]);
            }
            System.out.println();
        }
    }
}