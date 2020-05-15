package com.syh.collStudy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetStudy {
    public static void main(String[] args) {
        /**
         * set集合用于存储无序的元素，值不可以重复
         * 而list是有序的，值可以重复
         *
         */
        //set集合存储和取的顺序不一样
        Set set = new HashSet();
        set.add("英语一");
        set.add("鱼儿");
        set.add("数学一");
        set.add("数学二");
        System.out.println(set);
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
