package com.brave.solid.service.stateMachine;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.GenericTypeResolver;
import org.squirrelframework.foundation.fsm.StateMachineBuilderFactory;
import org.squirrelframework.foundation.fsm.StateMachineConfiguration;
import org.squirrelframework.foundation.fsm.UntypedStateMachine;
import org.squirrelframework.foundation.fsm.UntypedStateMachineBuilder;

public class AbstractStateMachineEngine <T extends UntypedStateMachine> implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    protected UntypedStateMachineBuilder stateMachineBuilder = null;

    //注入applicationContext，并在创建StateMachine实例时注入
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @SuppressWarnings("unchecked")
    public AbstractStateMachineEngine() {
        //识别泛型参数
        Class<T> genericType = (Class<T>) GenericTypeResolver.resolveTypeArgument(getClass(),AbstractStateMachineEngine.class);
        stateMachineBuilder = StateMachineBuilderFactory.create(genericType,ApplicationContext.class);
    }

    public void fire(OrderEvent orderEvent, OrderContext orderContext) {
        T stateMachine = stateMachineBuilder.newUntypedStateMachine(orderContext.orderDTO.getOrderState(),
                StateMachineConfiguration.create().enableDebugMode(true).enableAutoStart(true),
                applicationContext);
        stateMachine.fire(orderEvent,orderContext);
    }
}
