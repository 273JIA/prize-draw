package com.coding.us.domain.strategy.service.rule.chain;

import com.coding.us.domain.strategy.service.rule.chain.factory.DefaultChainFactory;

/**
 * 抽奖策略规则责任链接口
 */
public interface ILogicChain extends ILogicChainArmory, Cloneable {

    /**
     * 责任链接口
     *
     * @param userId     用户ID
     * @param strategyId 策略ID
     * @return 奖品对象
     */
    DefaultChainFactory.StrategyAwardVO logic(String userId, Long strategyId);

}
