package com.coding.us.domain.activity.service.quota.rule;

public interface IActionChainArmory {

    IActionChain next();

    IActionChain appendNext(IActionChain next);

}
