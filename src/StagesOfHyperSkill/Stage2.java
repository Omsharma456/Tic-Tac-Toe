package StagesOfHyperSkill;

import java.util.Scanner;

public class Stage2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cells: ");
        char[] cells = sc.next().toUpperCase().toCharArray();
        System.out.println("---------");
        System.out.print("| ");
        for (int i = 0; i <= 2; i++) {
            System.out.print(cells[i] + " ");
        }
        System.out.print("|\n| ");
        for (int i = 3; i <= 5; i++) {
            System.out.print(cells[i] + " ");
        }
        System.out.print("|\n| ");
        for (int i = 6; i <= 8; i++) {
            System.out.print(cells[i] + " ");
        }
        System.out.println("|");
        System.out.println("----------");
    }
}
