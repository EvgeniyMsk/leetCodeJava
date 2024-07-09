package ou.task37;

class Solution {
    public void solveSudoku(char[][] board) {
        // Начинаем решать от первой клетки
        solve(board, 0, 0);
    }
    private boolean solve(char[][] board, int row, int col) {
        // Если строка равна длине доски, вся доска заполнена.
        if (row == board.length) {
            return true;
        }
        // Переходим к следующей строке, когда текущая строка полностью заполнена
        if (col == board[0].length) {
            return solve(board, row + 1, 0);
        }
        // Пропускаем ячейки, которые уже заполнены
        if (board[row][col] != '.') {
            return solve(board, row, col + 1);
        }
        // Пробуем другие числа в текущей ячейке
        for (char num = '1'; num <= '9'; num++) {
            if (isValidPlacement(board, row, col, num)) {
                board[row][col] = num; // Заполняем текущую ячейку правильным номером
                // Переходим к следующей ячейке
                if (solve(board, row, col + 1)) {
                    return true;
                }
                // Возвращаемся к предыдущему состоянию, если решение не найдено
                board[row][col] = '.';
            }
        }
        // Не найдено правильное решение
        return false;
    }

    private boolean isValidPlacement(char[][] board, int row, int col, char num) {
        // Проверяем, находится ли число уже в той же строке, столбце или подсетке 3х3.
        for (int i = 0; i < board.length; i++) {
            // Проверка в строке
            if (board[i][col] == num) {
                return false;
            }
            // Проверка в колонке
            if (board[row][i] == num) {
                return false;
            }
            // Проверяем квадрат 3х3
            int subgridRow = 3 * (row / 3) + i / 3;
            int subgridCol = 3 * (col / 3) + i % 3;
            if (board[subgridRow][subgridCol] == num) {
                return false;
            }
        }
        return true;
    }
}
