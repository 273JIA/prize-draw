package com.coding.us.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import com.coding.us.infrastructure.persistent.po.Strategy;

import java.util.List;

/**
 * 抽奖策略 DAO
 */
@Mapper
public interface IStrategyDao {

    List<Strategy> queryStrategyList();

    Strategy queryStrategyByStrategyId(Long strategyId);

}
