package jqk.learn.javase.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 多线程
 * ClassNmae:ThreadClass
 * Package:jqk.learn.javase.test
 * Description:
 *
 * @Date:2020/10/12
 * @Author:JQK
 **/

public class ThreadClass {

    @Test
    public void myTest() {
        /**
         * 线程执行没有顺序
         * 1：线程如何执行？
         *  创建线程：
         *  implements runnable接口，并重写run()方法
         *  extends Thread类，并重写run()方法
         */

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();


        new ThreadCurrent().start();
        new Thread(new ThreadCurrent2()).start();

    }
}

//1:implements runnable接口，并重写run()方法
class ThreadCurrent2 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

//2:继承Thread类，重写run（）方法
class ThreadCurrent extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}


class GenericCollectiond {

    //理式代换：父类出现的地方，子类也能出现
    public static void print() {
        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        Number number = list.get(0);   //Number->Object->Number
        ArrayList<?> list2 = list;
        //list2.add("3333");   不允许add
        Object asa = list2.get(0);     //Objecct
    }
}



