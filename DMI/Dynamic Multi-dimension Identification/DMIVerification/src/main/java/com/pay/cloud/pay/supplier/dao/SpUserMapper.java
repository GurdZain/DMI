package com.pay.cloud.pay.supplier.dao;

import java.util.List;

import com.pay.cloud.pay.supplier.entity.SpUser;

public interface SpUserMapper {

    int insert(SpUser record);

    SpUser selectByPrimaryKey(Long spUserId);

    int updateByActId(SpUser record);
    
    List<SpUser> selectByActId(Long actId);
    
    SpUser selectByUserCode(String spUserCode);
}