package com.loikun.collections;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import java.util.Arrays;

public class ImmutableDemo {
    public static void main(String[] args) {
        ImmutableSet<String> set = ImmutableSet.of("a", "b", "c", "d");
        ImmutableSet<String> set1 = ImmutableSet.copyOf(set);
        ImmutableSet<String> set2 = ImmutableSet.<String>builder().addAll(set).add("e").build();
        System.out.println(set);
        System.out.println(set1);
        System.out.println(set2);
        // 集合转换成链表操作
        ImmutableList<String> list = set.asList();
        System.out.println(list);
    }

    public static void bubble(int[] a){
        int swap = 0;
        for (int i = 0; i < a.length ; i++) {
            for (int j = i; j <a.length ; j++) {
                if (a[j] > a[i]){
                    swap = a[i];
                    a[i] = a[j];
                    a[j] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static int binSearch(int a[], int tag){
        int first = 0;
        int end = a.length;
        for (int i = 0; i < a.length ; i++) {
            int middle = (first+ end)/2;
            if (tag == a[middle]){
                return middle;
            }
            if (tag> a[middle]){
                first = middle +1;
            }
            if (tag < a[middle]){
                end = middle -1;
            }
        }
        return 0;
    }
}
