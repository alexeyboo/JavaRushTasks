package com.javarush.task.task08.task0809;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Время для 10 тысяч вставок
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        Date today = new Date();
        insert10000(list);
        Date today1 = new Date();
        long time = today.getTime() - today1.getTime();
        return time;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(i, new Object());
        }
    }
}
