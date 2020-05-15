package com.syh.throwableStudy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class throwableStudy {
    public static void main(String[] args) {
        /**
         * throwable是Java语言中所有错误和异常的超类
         *      包含两个子类
         *      error：都是不受检异常，应用程序无序处理此类错误
         *          程序中无法处理的错误，表示运行应用程序出现了严重的错误
         *          通常是JVM错误
         *          Virtual MachineError
         *          NoClassDefFoundError
         *          OutOfMemoryError:内存不足错误
         *          StackOverflowError：堆栈溢出错误
         *      exception：程序本身可以捕获并且可以处理的异常。
         *          分为：运行时异常和编译时异常
         *          运行时异常：Java编译器不会去检查他，是不受检异常
         *              RuntimeException类及其子类，表示JVM在运行期间可能出现的异常
         *              比如NullPointerException空指针异常、ArrayIndexOutBoundException数组下标越界异常
         *              ClassCastException类型转换异常，ArithmeticException算术异常
         *              可以使用throws进行声明抛出
         *              也可以try-catch进行捕获
         *          编译时异常：Exception中除了RuntimeException及其子类之外的异常
         *              要通过throws进行声明抛出，或者通过try-catch进行捕获处理，否则不可以通过编译
         *              如classNotFoundException
         *              IOException及其子类
         *
         */



    }
    //直接抛出异常
    private static void readFile(String filePath)throws IOException{
        File file = new File(filePath);
        String result;
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while((result = reader.readLine())!= null){
            System.out.println(result);
        }
        reader.close();
    }


    //封装异常再抛出
//    private static void readFile1(String filePath)throws MyException{
//        try {
//
//        }catch (IOException e){
//            MyException ex = new MyException("read file failed");
//        }
//    }
    //try catch finally
}
