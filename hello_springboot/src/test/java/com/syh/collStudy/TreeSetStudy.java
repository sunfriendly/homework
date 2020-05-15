package com.syh.collStudy;

import java.util.TreeSet;

public class TreeSetStudy {
    public static void main(String[] args) {
        /**
         * treeSet底层使用红黑树的数据结构
         * 默认对元素进行自然排序
         * 也是不容许有重复元素的
         */
        String str = "10 80 12 22 66";
        String[] strs = str.split(" ");
        TreeSet ts = new TreeSet();
        for (int i = 0; i < strs.length; i++) {
            int y = Integer.parseInt(strs[i]);
            ts.add(y);
        }
        System.out.println(ts);//10,12,22,66,80
    }
}
