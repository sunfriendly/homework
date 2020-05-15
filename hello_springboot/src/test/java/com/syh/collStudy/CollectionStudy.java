package com.syh.collStudy;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionStudy {
    //collection接口下有三个子接口，分别是List,Set,Queue
    /**
     * List 接口：是一个有序（元素存入集合的顺序和取出的顺序一致）容器，元素可以重复，可以插入多个null值
     * 常用的实现类有ArrayList和LinkedList还有Vector
     * ArrayList和Vector底层数据结构使数组
     * LinkedList底层是双向循环列表
     * ArrayList比较适合查询操作较多的数据
     * LinkList比较适合插入和删除操作较多的数据
     */
    public static void main(String[] args){
        Collection list = new ArrayList();
        list.add("数据结构");
        list.add("操作系统");
        list.add("计算机网络");
        list.add("计算机组成原理");
        //输出的结果是按照插入顺序输出的
        System.out.println(list);

        Collection list2 = new ArrayList();
        list2.add("高数");
        list2.addAll(list);
        list2.add("线性代数");
        //同上，输出结果顺序与输入结果一致
        System.out.println(list2);

        //删除操作
        boolean remove = list2.remove("高数");
        System.out.println(list2);
        boolean remove1 = list2.removeAll(list);
        System.out.println(list2);

        //修改操作
        list2.clear();
        System.out.println(list2);

        //isEmpty方法判断集合是否为空
        System.out.println(list2.isEmpty());

        //contains方法判断是否包含某个字符串
        System.out.println(list2.contains("高数"));

        //containsAll方法判断是否含有某个集合中所有的值
        System.out.println(list2.containsAll(list));

        //size方法
        list2.add("离散数学");
        System.out.println(list2.size());

        //toArray()
        list2.add("概率论");
        list2.add("高等数学");
        Object[] array = list2.toArray();
        System.out.println(array[2]);


    }


}
