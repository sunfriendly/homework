package com.syh.collStudy;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStudy {
    /**
     * ArrayList实现List接口
     * 底层采用数组实现，默认10.每次增长60%
     * 查询快，删除慢
     * 在实际开发中Arraylist是使用频率很高的一个集合
     *
     */

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("数据结构");
        arrayList.add("操作系统");
        arrayList.add("计算机网络");
        arrayList.add("计算机组成原理");
        arrayList.add("数据结构");
        System.out.println(arrayList);
        ArrayList arrayList1 = new ArrayList();
        //去除arrayList 中重复的元素
        for (int i = 0; i <=arrayList.size() - 1; i++){
            Object obj = arrayList.get(i);
            if(!(arrayList1.contains(obj))){
                arrayList1.add(obj);
            }
        }
        System.out.println(arrayList1);
    }



}
