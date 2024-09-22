package com.coding.us.test;

import com.alibaba.fastjson2.JSON;
import com.coding.us.dto.RaffleAwardListRequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * 功能测试
 */
@Slf4j
//@RunWith(SpringRunner.class)
//@SpringBootTest
public class ApiTest {

    @Test
    public void test() {
        RaffleAwardListRequestDTO requestDTO = new RaffleAwardListRequestDTO();
        requestDTO.setUserId("xiaofuge");
        requestDTO.setActivityId(100301L);
        log.info(JSON.toJSONString(requestDTO));
    }

    private double convert(double min){
        double current = min;
        double max = 1;
        while (current < 1){
            current = current * 10;
            max = max * 10;
        }
        return max;
    }

}
