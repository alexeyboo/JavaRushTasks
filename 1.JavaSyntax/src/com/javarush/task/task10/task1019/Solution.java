package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        Integer id = 0;
        String name = null;
        int counter = 0;
        while (true) {
            try {
                id = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                break;
            }
            name = reader.readLine();
            map.put(name, id);
            counter++;
        }
        for (Map.Entry<String, Integer> pair: map.entrySet()) System.out.println(pair.getValue() + " " + pair.getKey());
    }
}
