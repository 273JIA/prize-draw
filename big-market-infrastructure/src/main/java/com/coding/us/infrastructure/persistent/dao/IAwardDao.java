package com.coding.us.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import com.coding.us.infrastructure.persistent.po.Award;

import java.util.List;

/**
 * 奖品表DAO
 */
@Mapper
public interface IAwardDao {

    List<Award> queryAwardList();

}
