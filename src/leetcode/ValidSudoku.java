package leetcode;

import java.util.HashMap;
import java.util.Map;

class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        char[][] board2 = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
//        System.out.println(isValidSudoku(board));
        System.out.println(isValidSudoku(board2));
    }

    ;

    public static boolean isValidSudoku(char[][] board) {
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < board.length; i++) {
            map.clear();
            for (int j = 0; j < board[i].length; j++) {
                if (map.containsKey(board[i][j]) || map.containsValue(board[j][i])) {
                    return false;
                }
                if (board[i][j] == '.' && board[j][i] == '.') {
                    continue;
                }
                map.put(board[i][j], board[j][i]);
            }
        }
        return true;
    }
}
