
public class HW5app4 {
    public static int[][] chessboard = new int[10][10];

    public static void printArray() {
        for (int[] row : chessboard) {
            for (int elem : row) {
                System.out.printf("%3d", elem);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean putTheFigureAndfillArray(int row, int col) {
        if (chessboard[row][col] == 0) {
            chessboard[row][col] = 2;
            int row1 = row;
            int col1 = col;
            boolean flagHorizonRight = true;
            while (flagHorizonRight) {
                if (chessboard[row1][col1 + 1] == 2) {
                    return false;
                } else if (chessboard[row1][col1 + 1] <= 1) {
                    chessboard[row1][col1 + 1] = 1;
                    col1++;
                } else {
                    row1 = row;
                    col1 = col;
                    flagHorizonRight = false;
                }
            }
            boolean flagdiagonalRightDown = true;
            while (flagdiagonalRightDown) {
                if (chessboard[row1 + 1][col1 + 1] == 2) {
                    return false;
                } else if (chessboard[row1 + 1][col1 + 1] <= 1) {
                    chessboard[row1 + 1][col1 + 1] = 1;
                    col1++;
                    row1++;
                } else {
                    row1 = row;
                    col1 = col;
                    flagdiagonalRightDown = false;
                }

            }
            boolean flagDown = true;
            while (flagDown) {
                if (chessboard[row1 + 1][col1] == 2) {
                    return false;
                } else if (chessboard[row1 + 1][col1] <= 1) {
                    chessboard[row1 + 1][col1] = 1;
                    row1++;
                }

                else {
                    row1 = row;
                    col1 = col;
                    flagDown = false;
                }
            }
            boolean flagDownLeft = true;
            while (flagDownLeft) {
                if (chessboard[row1 + 1][col1 - 1] == 2) {
                    return false;
                } else if (chessboard[row1 + 1][col1 - 1] <= 1) {
                    chessboard[row1 + 1][col1 - 1] = 1;
                    col1--;
                    row1++;
                }
                else {
                    row1 = row;
                    col1 = col;
                    flagDownLeft = false;
                }
            }
            boolean flagLeft = true;
            while (flagLeft) {
                if (chessboard[row1][col1 - 1] == 2) {
                    return false;
                } else if (chessboard[row1][col1 - 1] <= 1) {
                    chessboard[row1][col1 - 1] = 1;
                    col1--;
                }
                else {
                    row1 = row;
                    col1 = col;
                    flagLeft = false;
                }
            }
            boolean flagdiagonalLeftUp = true;
            while (flagdiagonalLeftUp) {
                if (chessboard[row1 - 1][col1 - 1] == 2) {
                    return false;
                } else if (chessboard[row1 - 1][col1 - 1] <= 1) {
                    chessboard[row1 - 1][col1 - 1] = 1;
                    col1--;
                    row1--;
                }
                else {
                    row1 = row;
                    col1 = col;
                    flagdiagonalLeftUp = false;
                }
            }
            boolean flagUp = true;
            while (flagUp) {
                if (chessboard[row1 - 1][col1] == 2) {
                    return false;
                } else if (chessboard[row1 - 1][col1] <= 1) {
                    chessboard[row1 - 1][col1] = 1;
                    row1--;
                }
                else {
                    row1 = row;
                    col1 = col;
                    flagUp = false;
                }
            }
            boolean flagdiagonalRightUp = true;
            while (flagdiagonalRightUp) {
                if (chessboard[row1 - 1][col1 + 1] == 2) {
                    return false;
                } else if (chessboard[row1 - 1][col1 + 1] <= 1) {
                    chessboard[row1 - 1][col1 + 1] = 1;
                    col1++;
                    row1--;
                }
                else {
                    row1 = row;
                    col1 = col;
                    flagdiagonalRightUp = false;
                }
            }
            return true;
        } 
        else {
            return false;
        }
    }

    public static void fillTheBorders() {
        int row = 0;
        int col = 0;
        for (int i = 0; i < 40; i++) {
            if (i <= 9) {
                chessboard[row][col] = 3;
                col++;
            } else if (i >= 10 && i <= 19) {
                col = 9;
                chessboard[row][col] = 3;
                row++;
            } else if (i > 20 && i <= 30) {
                row = 9;
                chessboard[row][col] = 3;
                col--;
            } else if (i > 30 && i <= 39) {
                col = 0;
                chessboard[row][col] = 3;
                row--;
            }

        }
    }

    public static void putTheFigures() {
        for (int k = 1; k < 9; k++) {
            for (int v = 1; v < 9; v++) {
                cleanArray();
                putTheFigureAndfillArray(k, v);
                int count = 0;
                int countFlag = 0;
                while (count < 8) {
                    count++;
                    boolean flag = false;
                    for (int i = 1; i < 9; i++) {
                        if (flag) {
                            break;
                        }
                        for (int j = 1; j < 9; j++) {
                            if (!putTheFigureAndfillArray(i, j)) {
                                continue;
                            } else {
                                flag = true;
                                break;
                            }
                        }
                    }
                    if (flag) {
                        countFlag++;
                    }
                    if (countFlag < count) {
                        break;
                    }
                    if (countFlag == 7) {
                        cleanFigPath();
                        printArray();
                        
                    }

                }

            }
        }
        return;
    }

    public static void cleanArray() {
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                chessboard[i][j] = 0;
            }
        }
    }

    public static void cleanFigPath() {
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if (chessboard[i][j] == 1) {
                    chessboard[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("3 - границы массива, 2 - ферзи");
        System.out.println();
        System.out.println("  готовая расстановка ферзей:");
        System.out.println();
        cleanArray();
        fillTheBorders();
        putTheFigures();

    }
}
