package com.loikun;

import com.google.common.base.Joiner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class JoinerDemo {
    public static void main(String[] args) {
         /*
         on:制定拼接符号，如：test1-test2-test3 中的 “-“ 符号
         skipNulls()：忽略NULL,返回一个新的Joiner实例
         useForNull(“Hello”)：NULL的地方都用字符串”Hello”来代替
        */
        StringBuilder builder = new StringBuilder();
        Joiner.on(",").skipNulls().appendTo(builder, "hello", "guava");
        System.out.println(builder);
        System.out.println(Joiner.on(",").useForNull("none").join(1, null, 3));
        System.out.println(Joiner.on(",").skipNulls().join(Arrays.asList(1, 2, 3, 4, 5, null, 6)));
        Map<String, String> map = new HashMap<>();
        map.put("key1", "val1");
        map.put("key2", "val2");
        map.put("key3", "val3");
        System.out.println(Joiner.on(",").withKeyValueSeparator("->").join(map));
    }
}
