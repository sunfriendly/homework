package com.syh.collStudy;

import java.util.HashSet;
import java.util.Set;

public class HashSetStudy {
    public static void main(String[] args) {
        /**
         * hashSet是线程不安全的，存取速度快。底层是以哈希表实现的
         * hashset会通过hashcode和equals两个方法来比较元素是否重复
         * 对应的HashSet先判断两个元素的hashcode是否相同，如果一样，接着会比较equals方法，如果equals结果
         * 为真，hashset就会认为这两个元素是一样的
         */
        Set set = new HashSet();
        set.add("java核心卷一");
        set.add("java核心卷二");
        set.add("java编程思想");
        System.out.println(set);
        //添加成功，会返回true，否则返回值为false
        boolean add = set.add("java编程思想");
        System.out.println(add);
        System.out.println(set.size());

    }
}
