package algorithmicThinking;

public class SnowflakesOnMyOwn {
    public static void main(String[] args) {
        int[] first = {1, 2, 8, 4, 5, 6};
        int[] second = {4, 5, 6, 1, 2, 3};
        int[] third = {3, 4, 5, 6, 7, 8};
        System.out.println(areIdentical(first, second));
        System.out.println(areIdentical(first, third));
        System.out.println(areIdentical(second, third));
        int[][] snowflakes = new int[][]{first, second, third};
        System.out.println(identifyIdentical(snowflakes, 3));
    }

    static int code(int[] snowflake){
        int size = 100000;
        return (snowflake[0] + snowflake[1] + snowflake[2] + snowflake[3] + snowflake[4]
         + snowflake[5] % size);
    }


    static int compare(int[] snowflake1, int[] snowflake2) {
        if (areIdentical(snowflake1, snowflake2) == 1) {
            return 0;
        }
        for (int i = 0; i < 6; i++) {
            if (snowflake1[i] < snowflake2[i]) {
                return -1;
            }

        }
        return 1;
    }


    static boolean identifyIdentical(int[][] values, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (areIdentical(values[i], values[j]) == 1) {
                    System.out.println("Twin snowflakes found");
                    return true;
                }
            }
        }

        System.out.println("No two snowflakes are alike");
        return false;
    }

    static int areIdentical(int[] snowflake1, int[] snowflake2) {
        for (int start = 0; start < 6; start++) {
            if (identifyRight(snowflake1, snowflake2, start) == 1) {
                return 1;
            }
            if (identifyLeft(snowflake1, snowflake2, start) == 1) {
                return 1;
            }
        }
        return 0;
    }

    static int identifyRight(int[] snowflake1, int[] snowflake2, int start) {
        int snow2Index;
        for (int i = 0; i < 6; i++) {
            snow2Index = start + i;
            if (snow2Index >= 6) {
                snow2Index = snow2Index - 6;
            }
            if (snowflake1[i] != snowflake2[snow2Index]) {
                return 0;
            }
        }
        return 1;
    }

    static int identifyLeft(int[] snowflake1, int[] snowflake2, int start) {
        int snow2Index;
        for (int i = 0; i < 6; i++) {
            snow2Index = start - i;
            if (snow2Index < 0) {
                snow2Index = snow2Index + 6;
            }
            if (snowflake1[i] != snowflake2[snow2Index]) {
                return 0;
            }

        }
        return 1;
    }


}
