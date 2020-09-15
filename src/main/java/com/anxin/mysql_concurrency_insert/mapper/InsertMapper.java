package com.anxin.mysql_concurrency_insert.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Map;

/**
 * @author masai
 * @date 2020/9/14
 */
@Component
public interface InsertMapper {
      int insert(List<Map<String, String>> insertList );
}
