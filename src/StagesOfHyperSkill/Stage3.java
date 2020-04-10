package StagesOfHyperSkill;

import java.util.Scanner;

public class Stage3 {
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        char index = ' ';
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cells: ");
        char[] cells = sc.next().toUpperCase().toCharArray();
        System.out.println("---------");
        char[][] newCells = {{cells[0], cells[1], cells[2]}, {cells[3], cells[4], cells[5]}, {cells[6], cells[7], cells[8]}};
        System.out.print("| ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(newCells[i][j] + " ");
                if (newCells[i][0] == newCells[i][1] && newCells[i][1] == newCells[i][2]) {
                    count1 += 1;
                    if (count1 == 3) {
                        index = newCells[i][0];
                    }
                } else if (newCells[0][i] == newCells[1][i] && newCells[1][i] == newCells[2][i]) {
                    count2 += 1;
                    if (count2 == 3) {
                        index = newCells[0][i];
                    }
                }
            }
            if (i != 2) {
                System.out.print("|\n| ");
            } else {
                System.out.println("|");
            }
        }
        System.out.println("---------");
        if (count1 == 6 || count2 == 6) {
            System.out.println("Impossible");
        } else if (newCells[0][2] == newCells[1][1] && newCells[1][1] == newCells[2][0]) {
            System.out.println(newCells[0][2] + " wins");
        } else if ((newCells[0][0] == newCells[1][1] && newCells[1][1] == newCells[2][2])) {
            System.out.println(newCells[0][0] + " wins");
        } else if (index == 'X' || index == 'O') {
            System.out.println(index + " wins");
        } else if (cells[cells.length - 1] == '_') {
            System.out.println("Game not finished");
        } else if (newCells[0][0] == '_' && newCells[0][2] == '_' && newCells[1][1] == '_' && newCells[1][2] == '_' && newCells[2][1] == '_') {
            System.out.println("Impossible");
        } else if (newCells[0][0] == '_' && newCells[1][2] == '_' && newCells[2][1] == '_') {
            System.out.println("Impossible");
        } else {
            System.out.println("Draw");
        }
    }
}
