package com.coding.us.domain.rebate.repository;

import com.coding.us.domain.rebate.model.aggregate.BehaviorRebateAggregate;
import com.coding.us.domain.rebate.model.entity.BehaviorRebateOrderEntity;
import com.coding.us.domain.rebate.model.valobj.BehaviorTypeVO;
import com.coding.us.domain.rebate.model.valobj.DailyBehaviorRebateVO;

import java.util.List;

/**
 * 行为返利服务仓储接口
 */
public interface IBehaviorRebateRepository {

    List<DailyBehaviorRebateVO> queryDailyBehaviorRebateConfig(BehaviorTypeVO behaviorTypeVO);

    void saveUserRebateRecord(String userId, List<BehaviorRebateAggregate> behaviorRebateAggregates);

    List<BehaviorRebateOrderEntity> queryOrderByOutBusinessNo(String userId, String outBusinessNo);

}
