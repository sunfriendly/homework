package com.syh.collStudy;

import java.util.Enumeration;
import java.util.Vector;

public class VectorStudy {
    public static void main(String[] args) {
        /**
         * Vector是一个线程安全的ArrayList
         * ArrayList单线程效率高
         * Vector多线程效率低
         */
        //addElement()在结合末尾添加元素
        Vector vector = new Vector();
        vector.addElement("在细雨中呐喊");
        vector.addElement("兄弟");
        vector.addElement("活着");
        System.out.println(vector);
        System.out.println(vector.elementAt(2));
        //Enumeration elements()返回集合中所有元素，封装到Enumeration对象中
        Enumeration e = vector.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }


    }
}
