package com.anxin.mysql_concurrency_insert.data;

import com.anxin.mysql_concurrency_insert.mapper.InsertMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * description:  交流信息数据获取及存库线程
 *
 * @author masai
 * @date 2019/10/18
 */
@Component
public class InsertRunable implements Runnable {
    private InsertService insertService;
    public void run() {
        try {
            System.out.println("当前线程名称为：" + Thread.currentThread().getName());
            this.insertService = (InsertService)ApplicationContextProvider.getBean("insertService");
            insertService.doInsert();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
