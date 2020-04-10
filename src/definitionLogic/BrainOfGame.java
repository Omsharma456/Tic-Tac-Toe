package definitionLogic;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;

public class BrainOfGame {
    public static void brain() {
        while (true) {
            int count1 = 0;
            int count2 = 0;
            char index = ' ';
            char variable = 'X';
            int countElement = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("---------");
            char[][] newCells = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
            System.out.print("| ");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(newCells[i][j] + " ");
                }
                if (i != 2) {
                    System.out.print("|\n| ");
                } else {
                    System.out.println("|");
                }
            }
            System.out.println("---------");
            while (true) {
                System.out.print("Enter the coordinates: ");
                int row = 0;
                int column = 0;
                int indexRow = 0;
                int indexColumn = 0;
                boolean validInput = false;
                while (!validInput) {
                    try {
                        row = sc.nextInt();
                        column = sc.nextInt();
                        validInput = true;
                    } catch (InputMismatchException e) {
                        System.out.println("You should enter numbers!");
                        System.out.print("Enter the coordinates: ");
                        sc.nextLine();
                    }
                }
                if (row == 1 && column == 1) {
                    indexRow = 2;
                    indexColumn = 0;
                } else if (row == 1 && column == 2) {
                    indexRow = 1;
                    indexColumn = 0;
                } else if (row == 1 && column == 3) {
                    indexRow = 0;
                    indexColumn = 0;
                } else if (row == 2 && column == 1) {
                    indexRow = 2;
                    indexColumn = 1;
                } else if (row == 2 && column == 2) {
                    indexRow = 1;
                    indexColumn = 1;
                } else if (row == 2 && column == 3) {
                    indexRow = 0;
                    indexColumn = 1;
                } else if (row == 3 && column == 1) {
                    indexRow = 2;
                    indexColumn = 2;
                } else if (row == 3 && column == 2) {
                    indexRow = 1;
                    indexColumn = 2;
                } else if (row == 3 && column == 3) {
                    indexRow = 0;
                    indexColumn = 2;
                }
                if (newCells[indexRow][indexColumn] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                }
                if (row > 3 || column > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;
                }
                System.out.println("---------");
                System.out.print("| ");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (newCells[indexRow][indexColumn] == ' ') {
                            newCells[indexRow][indexColumn] = variable;
                            if (variable == 'X') {
                                variable = 'O';
                            } else {
                                variable = 'X';
                            }
                        }
                        if (newCells[i][0] != ' ') {
                            if (newCells[i][0] == newCells[i][1] && newCells[i][1] == newCells[i][2]) {
                                count1 += 1;
                                if (count1 == 3) {
                                    index = newCells[i][0];
                                }
                            }
                        }
                        if (newCells[0][i] != ' ') {
                            if (newCells[0][i] == newCells[1][i] && newCells[1][i] == newCells[2][i]) {
                                count2 += 1;
                                if (count2 == 3) {
                                    index = newCells[0][i];
                                }
                            }
                        }
                        System.out.print(newCells[i][j] + " ");
                    }
                    if (i != 2) {
                        System.out.print("|\n| ");
                    } else {
                        System.out.println("|");
                    }
                }
                System.out.println("---------");
                if (newCells[0][2] != ' ' && newCells[0][2] == newCells[1][1] && newCells[1][1] == newCells[2][0]) {
                    System.out.println(newCells[0][2] + " wins");
                    exit(0);
                } else if ((newCells[0][0] != ' ' && newCells[0][0] == newCells[1][1] && newCells[1][1] == newCells[2][2])) {
                    System.out.println(newCells[0][0] + " wins");
                    exit(0);
                } else if (index == 'X' || index == 'O') {
                    System.out.println(index + " wins");
                    exit(0);
                }
                count1 = 0;
                count2 = 0;
                int count4 = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (newCells[i][j] != ' ') {
                            count4 += 1;
                        }
                    }
                }
                if (count4 == 9) {
                    System.out.println("Draw");
                    exit(0);
                    break;
                }

            }
        }
    }
}
