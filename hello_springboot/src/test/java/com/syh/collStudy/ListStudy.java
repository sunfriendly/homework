package com.syh.collStudy;

import java.util.ArrayList;
import java.util.List;

public class ListStudy {
    public static void main(String[] args) {
        /**
         * list接口 元素可以重复，容许在指定位置插入元素，并通过索引来访问元素
         * list特有的方法有 void add(int index, E element)指定位置添加元素
         *                  void addAll(int index, Collection c)指定位置添加集合
         *                  remove(int index)删除指定元素
         *                  set(int index, E element)替换指定位置元素*
         *
         */

        List list = new ArrayList();
        list.add("数据结构");
        list.add("操作系统");
        list.add("计算机网络");
        list.add("计算机组成原理");
        System.out.println(list);
        //在指定位置添加元素
        list.add(0,"数字图像处理");
        System.out.println(list);
        List list2 = new ArrayList();
        list2.add("C语言");
        list2.add("java语言");
        list2.add("C#");
        //在指定位置添加集合
        list2.add(1, list);
        System.out.println(list2);

        //删除指定位置元素
        list2.remove(0);
        System.out.println(list2);

        //修改指定位置元素
        list2.set(1,"活着");
        System.out.println(list2);

        //查找指定位置元素，查找最后一个元素
        System.out.println(list2.get(list2.size()-1));

        //查看元素索引
        int index = list2.indexOf(list);
        System.out.println(index);



    }
}
