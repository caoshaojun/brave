package com.brave.solid.service.stateMachine;

import com.brave.solid.model.OrderDTO;

public class OrderContext {
    public OrderDTO orderDTO;

    public OrderContext() {
    }

    public OrderContext(OrderDTO orderDTO) {
        this.orderDTO = orderDTO;
    }
}
