package com.brave.solid.service.stateMachine;

public enum OrderEvent {
    SUBMIT_ORDER,
    PAY,
    PART_SEND,
    SEND,
    COMPLETE
}
