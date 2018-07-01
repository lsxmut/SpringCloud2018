package com.atguigu.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.atguigu.springcloud.entities.Dept;

//Spring Boot与mybatis整合   接口上面一定要加@Mapper
@Mapper
public interface DeptDao {
	
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();

}
