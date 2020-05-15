package com.syh.collStudy;

import java.util.HashMap;
import java.util.Map;

public class MapStudy {
    public static void main(String[] args) {
        /**
         * 按照键值存储元素
         * 键不可以重复，值可以重复
         * map存储元素使用put方法,collection存储元素使用add
         * HashMap采用哈希表实现，所以无序，线程不同步
         * LinkedHashMap基于哈希表又加入了链表，对map进行增删效率提高
         * TreeMap可以对键进行排序，底层是二叉树数据结构
         * hashtable不要学不要用
         *
         */
        Map map = new HashMap();
        //使用put和putAll方法添加元素
        map.put(1,"徐云鹤");
        map.put(2,"姜震");
        map.put(3,"董渭华");
        map.put(4,"王军");
        map.put(5,"Lina");
        System.out.println(map);
        //remove 删除关联对象，指定key对象
        map.remove(1);
        System.out.println(map);
        //get(key)获取key值对应的对象
        String str = (String) map.get(2);
        System.out.println(str);
        //contains(key) contains(value)
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("Lina"));
        //clear清空集合对象
        map.clear();
        System.out.println(map);
        //isEmpty()判断是否为空
        System.out.println(map.isEmpty());


    }
}
