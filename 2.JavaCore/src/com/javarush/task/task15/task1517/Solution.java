package com.javarush.task.task15.task1517;

/* 
Статики и исключения
*/

public class Solution {
    public static int A = 0;

    static {
        int a = 1/0;
        //throw an exception here - выбросьте эксепшн тут
    }

    public static int B = 5;

    public static void main(String[] args) {
        //Solution solution = new Solution();
        System.out.println(B);
    }
}
