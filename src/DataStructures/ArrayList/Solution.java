package DataStructures.ArrayList;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        List<List<Integer>> matrix = new java.util.ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int linesNumber = sc.nextInt();
        int numbersCount;
        for (int i = 0; i < linesNumber; i++) {
            numbersCount = sc.nextInt();
            List<Integer> numbersLine = new java.util.ArrayList<>(numbersCount);
            for (int j = 0; j < numbersCount; j++) {
                numbersLine.add(sc.nextInt());
            }
            matrix.add(numbersLine);
        }
        int queriesCount = sc.nextInt();
        int row, column;
        for (int i = 0; i < queriesCount; i++) {
            row = sc.nextInt();
            column = sc.nextInt();
            try {
                System.out.println(matrix.get(row).get(column));
            } catch (IndexOutOfBoundsException exc) {
                System.out.println("ERROR!");
            }
        }
    }
}
