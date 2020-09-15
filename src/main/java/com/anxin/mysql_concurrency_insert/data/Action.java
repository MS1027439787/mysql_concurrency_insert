package com.anxin.mysql_concurrency_insert.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author masai
 * @date 2020/9/14
 */
@Component
public class Action  implements CommandLineRunner  {
    @Autowired
    InsertService insertService;
    public void run(String[] args){
        InsertRunable task = new InsertRunable();
        int i = 0;
        while (i <= 20){
            Thread t1 = new Thread(task);
            System.out.println("线程启动：");
            t1.start();
            i++;
        }

//        Thread t2 = new Thread(task);
//        System.out.println("线程2启动：");
//        t2.start();
//        Thread t3 = new Thread(task);
//        System.out.println("线程3启动：");
//        t3.start();
//        Thread t4 = new Thread(task);
//        System.out.println("线程4启动：");
//        t4.start();
    }
}
