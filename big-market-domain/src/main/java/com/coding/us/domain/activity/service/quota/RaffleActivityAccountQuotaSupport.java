package com.coding.us.domain.activity.service.quota;

import com.coding.us.domain.activity.model.entity.ActivityCountEntity;
import com.coding.us.domain.activity.model.entity.ActivityEntity;
import com.coding.us.domain.activity.model.entity.ActivitySkuEntity;
import com.coding.us.domain.activity.repository.IActivityRepository;
import com.coding.us.domain.activity.service.quota.rule.factory.DefaultActivityChainFactory;

/**
 * 抽奖活动的支撑类
 */
public class RaffleActivityAccountQuotaSupport {

    protected DefaultActivityChainFactory defaultActivityChainFactory;

    protected IActivityRepository activityRepository;

    public RaffleActivityAccountQuotaSupport(IActivityRepository activityRepository, DefaultActivityChainFactory defaultActivityChainFactory) {
        this.activityRepository = activityRepository;
        this.defaultActivityChainFactory = defaultActivityChainFactory;
    }

    public ActivitySkuEntity queryActivitySku(Long sku) {
        return activityRepository.queryActivitySku(sku);
    }

    public ActivityEntity queryRaffleActivityByActivityId(Long activityId) {
        return activityRepository.queryRaffleActivityByActivityId(activityId);
    }

    public ActivityCountEntity queryRaffleActivityCountByActivityCountId(Long activityCountId) {
        return activityRepository.queryRaffleActivityCountByActivityCountId(activityCountId);
    }

}
