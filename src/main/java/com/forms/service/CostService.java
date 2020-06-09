package com.forms.service;

import com.forms.entity.CostEntity;

import java.util.List;

public interface CostService {

    //获取用户消费数据列表
    public List getList(CostEntity entity);

}
