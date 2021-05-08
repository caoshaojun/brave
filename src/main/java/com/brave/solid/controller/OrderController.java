package com.brave.solid.controller;

import com.brave.solid.model.OrderDTO;
import com.brave.solid.service.stateMachine.OrderContext;
import com.brave.solid.service.stateMachine.OrderEvent;
import com.brave.solid.service.stateMachine.OrderState;
import com.brave.solid.service.stateMachine.OrderStateMachineEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderStateMachineEngine orderStateMachineEngine;

    @GetMapping("/test")
    public void test() {
        OrderDTO orderDTO = new OrderDTO(OrderState.WAIT_PAY);
        OrderContext orderContext = new OrderContext(orderDTO);
        orderStateMachineEngine.fire(OrderEvent.PAY, orderContext);
    }
}
