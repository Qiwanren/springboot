package com.forms.mapper;

import com.forms.entity.CostEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List getList(CostEntity entity);

}
