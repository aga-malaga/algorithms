package algorithmicThinking;

import java.util.Scanner;

public class IdenticalSnowflakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 0 || n > 100000){
            return;
        }
        int[][] snowflakes = new int[n][6];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 6; j++){
             int snowflake = scanner.nextInt();
             if (snowflake < 0 || snowflake >= 10000000){
                 return;
             }
             snowflakes[i][j] = snowflake;
            }
        }
        identifyIdentical(snowflakes, n);

    }

    static void identifyIdentical(int values[][], int n){
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (areIdentical(values[i], values[j]) == 1){
                    System.out.println(String.format("Twin snowflakes found"));
                    return;
                }
            }
        }
        System.out.println("No two snowflakes are alike");
    }

    static int areIdentical(int[] snow1, int[] snow2){
        int start;
        for (start = 0; start < 6; start++){
            if (identicalRight(snow1, snow2, start) == 1){
                return 1;
            }
            if (identicalLeft(snow1,snow2, start) == 1){
                return 1;
            }
        }
        return 0;
    }

    static int identicalRight(int[] snow1, int[] snow2, int start){
        int offset, snow2Index;
        for (offset = 0; offset < 6; offset++) {
            snow2Index = start + offset;
            if (snow2Index >= 6){
                snow2Index = snow2Index - 6;
            }
            if (snow1[offset] != snow2[(snow2Index) % 6]){
                return 0;
            }
        }
        return 1;
    }

    static  int identicalLeft(int[] snow1, int[] snow2, int start){
        int offset, snow2Index;
        for (offset = 0; offset < 6; offset++){
            snow2Index = start - offset;
            if (snow2Index < 0){
                snow2Index = snow2Index + 6;
            }
            if (snow1[offset] != snow2[snow2Index]){
                return 0;
            }
        }
        return 1;
    }
}
