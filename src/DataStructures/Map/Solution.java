package DataStructures.Map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for(int i = 0; i < n; i++) {
            String name=in.nextLine();
            int phone=in.nextInt();
            map.put(name, phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if (map.containsKey(s)) {
                System.out.printf("%s=%d\n", s, map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
