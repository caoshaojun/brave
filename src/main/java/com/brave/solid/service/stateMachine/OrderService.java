package com.brave.solid.service.stateMachine;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService {

    /**
     * 假设订单状态发生变化，插入数据库
     *
     * @param state
     */
    public void submitOrder(OrderState state) {
        log.info("提交订单service:此时state：{}", state);
    }
}
