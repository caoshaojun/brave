package com.brave.solid.model;

import com.brave.solid.service.stateMachine.OrderState;
import lombok.Data;

import java.util.Date;

@Data
public class OrderDTO {

    private Integer orderId;

    private OrderState orderState;

    private Date createTime;

    private Date updateTime;

    public OrderDTO(OrderState state) {
        this.orderState = state;
    }

    public OrderDTO() {
    }
}
