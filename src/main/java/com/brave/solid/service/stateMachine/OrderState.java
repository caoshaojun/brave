package com.brave.solid.service.stateMachine;

public enum OrderState {
    INIT,

    WAIT_PAY,

    WAIT_SEND,

    PART_SEND,

    WAIT_RECEIVE,

    COMPLETE,

    CANCELED;

    public static OrderState getState(String state) {
        for (OrderState orderState : OrderState.values()) {
            if (orderState.name().equalsIgnoreCase(state)) {
                return orderState;
            }
        }
        return null;
    }
}
