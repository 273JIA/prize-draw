package com.coding.us.domain.award.repository;

import com.coding.us.domain.award.model.aggregate.UserAwardRecordAggregate;

/**
 * 奖品仓储服务
 */
public interface IAwardRepository {

    void saveUserAwardRecord(UserAwardRecordAggregate userAwardRecordAggregate);

}
