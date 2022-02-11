package DataStructures.List;

import java.util.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        int queriesNumber = sc.nextInt();
        String command;
        for (int i = 0; i < queriesNumber; i++) {
            command = sc.next();
            if (command.equals("Insert")) {
                numbers.add(sc.nextInt(), sc.nextInt());
            } else if (command.equals("Delete")) {
                numbers.remove(sc.nextInt());
            }
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
