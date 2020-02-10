package com.jgybzx.dao.cargo;

import com.jgybzx.domain.cargo.Factory;
import com.jgybzx.domain.cargo.FactoryExample;

import java.util.List;

public interface FactoryDao {

    // 根据主键删除数据
    int deleteByPrimaryKey(String id);
    // 插入数据，要求对象必须全部赋值，否则全是null
    int insert(Factory record);
    // 动态sql，判断是否有值
    int insertSelective(Factory record);
    // 支持各种简单的条件查询，like，排序，等等
    List<Factory> selectByExample(FactoryExample example);
    // 根据主键查询
    Factory selectByPrimaryKey(String id);
    //根据主键修改对象，同样是动态sql
    int updateByPrimaryKeySelective(Factory record);
    // 根据主键修改对象，要求对象数据全部封装
    int updateByPrimaryKey(Factory record);
}