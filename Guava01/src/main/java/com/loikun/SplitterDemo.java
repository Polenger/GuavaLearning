package com.loikun;

import com.google.common.base.Splitter;

public class SplitterDemo {
    public static void main(String[] args) {
        /**
         * Spliter 默认连接符是 逗号
         *  on: 指定分隔符来分割字符串
         *  limit: 当分割子字符串达到limit 所限制的个数时停止分割
         *  trimResults: 去掉字串中的空格
         *  fixedLength： 根据长度来拆分字符串
         *  omitEmptyStrings：去掉空的子串
         *
         */
        System.out.println(Splitter.on(",").limit(3).trimResults().split("a,     b, c, d  "));
        //[a, b, c, d]
        System.out.println(Splitter.fixedLength(3).split("1 23"));
        //[1 2, 3]
        System.out.println(Splitter.on(" ").omitEmptyStrings().splitToList("1  2 3"));
        //[1, 2, 3]
        System.out.println(Splitter.on(";").withKeyValueSeparator(":").split("a:1;b:2;c:3"));
        // {a=1, b=2, c=3}
    }
}
