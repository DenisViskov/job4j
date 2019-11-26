package ru.job4j.array;

/**
 * Класс реализует функционал проверки выигрышной ситуации в игре сокобан
 *
 * @author Денис Висков
 * @version 1.3
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
        char sign = 'X';
        int rowX = 0;
        int cellX = 0;
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                if (board[row][cell] == sign) {
                    for (int i = 0; i < board.length; i++) {
                        if (board[row][i] == sign) {
                            rowX++;
                        }
                        if (board[i][cell] == sign) {
                            cellX++;
                        }
                        if (rowX == board.length || cellX == board.length) {
                            result = true;
                            break;
                        }
                    }
                    rowX = 0;
                    cellX = 0;
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

