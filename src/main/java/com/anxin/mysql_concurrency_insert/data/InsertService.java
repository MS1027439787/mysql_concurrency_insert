package com.anxin.mysql_concurrency_insert.data;

import com.anxin.mysql_concurrency_insert.mapper.InsertMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author masai
 * @date 2020/9/14
 */
@Component("insertService")
public class InsertService {
    @Autowired
    InsertMapper insertMapper;

    public void doInsert() {
        try {
            List<Map<String, String>> list = new ArrayList();
            int i = 0;
            while(i <= 20000){
                Map<String, String> map = new HashMap<>();
                map.put("nameab", "马赛" + i);
                map.put("age", "20");
                map.put("classname", i + "班");
                list.add(map);
                i++;
            }
            insertMapper.insert(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
