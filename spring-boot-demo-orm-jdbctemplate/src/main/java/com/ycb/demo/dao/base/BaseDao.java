package com.ycb.demo.dao.base;

import java.util.List;

/**
 * @author 袁存波
 * @version 1.0
 * @create 2023-06-05 23:09
 * DAO基类
 */

public interface BaseDao<T> {
    //插入数据insert语句
    Integer insert(T t);

    //删除数据
    Integer deleteById();

    //修改数据
    Integer updateById();

    //查询一行数据
    T serachOneById();

    //查询多行数据
    List<T> serachManyById();
}
