package com.syh.collStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListStudy {
    public static void main(String[] args) {
        /**
         * LinkedList 是链表数据结构实现的集合，增加和删除的比较快，查询比较慢
         * 特有的方法
         * addFirst(E e)
         * addLast(E e)
         * getFirst()
         * getLast()
         * removeFirst()
         * removeLast()
         *
         */
        LinkedList list = new LinkedList();
        list.add("数据结构");
        list.add("操作系统");
        list.add("计算机网络");
        list.add("计算机组成原理");
        System.out.println(list);
        list.addFirst("太乙真人");
        list.addLast("王二");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.removeFirst();
        System.out.println(list);

        //迭代
        Iterator it = list.iterator();
        while (it.hasNext()){
            String str = (String)it.next();
            System.out.println(str);

        }
    }
}
