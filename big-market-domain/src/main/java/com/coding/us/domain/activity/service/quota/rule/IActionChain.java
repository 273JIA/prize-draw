package com.coding.us.domain.activity.service.quota.rule;

import com.coding.us.domain.activity.model.entity.ActivityCountEntity;
import com.coding.us.domain.activity.model.entity.ActivityEntity;
import com.coding.us.domain.activity.model.entity.ActivitySkuEntity;

/**
 * 下单规则过滤接口
 */
public interface IActionChain extends IActionChainArmory {

    boolean action(ActivitySkuEntity activitySkuEntity, ActivityEntity activityEntity, ActivityCountEntity activityCountEntity);

}
