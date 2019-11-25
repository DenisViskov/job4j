package ru.job4j.array;

/**
 * Класс реализует функционал проверки выигрышной ситуации в игре сокобан
 *
 * @author Денис Висков
 * @version 1.0
 * @since 23.11.2019
 */
public class MatrixCheck {

    /**
     * Метод реализует проверку массива на наличие выйгрышной комбинации
     *
     * @param board - массив
     * @return - флаг "true","false"
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        int count = 0;
        char sign = 'X';
        FIRSTCHECK:
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                if (board[row][cell] == sign) {
                    count++;
                } else {
                    continue FIRSTCHECK;
                }
            }
        }
        if (count == board.length) {
            result = true;
            return result;
        }
        SECONDCHEK:
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                if (board[row][cell] == sign && row == 0) {
                    for (int i = 0; i < board.length; i++) {
                        if (board[i][cell] == sign) {
                            count++;
                        } else {
                            break SECONDCHEK;
                        }
                    }
                } else if (count == board.length) {
                    result = true;
                    break SECONDCHEK;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] hasWinVertical = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean win = isWin(hasWinVertical);
        System.out.println("A board has a winner : " + win);
        System.out.println();
        char[][] hasWinHor = {
                {'_', '_', '_', '_', '_'},
                {'X', 'X', 'X', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        boolean winHor = isWin(hasWinHor);
        System.out.println("A board has a winner : " + winHor);
        System.out.println();
        char[][] notWin = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', 'X', '_', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean lose = isWin(notWin);
        System.out.println("A board has a winner : " + lose);
    }
}
