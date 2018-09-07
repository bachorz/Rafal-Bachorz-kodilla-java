package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FacadeWatcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(FacadeWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..)) && args(order ,userID) && target(object)")
    public void logEventFacade (OrderDto order, Object object, Long userID) {
        LOGGER.info("Registration of the event, was called: " + object.getClass().getName() + ", userId: " + userID + ", order: " + order);
    }

    @Around("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public Object measureTimeFacade (final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long start = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long endProcess = System.currentTimeMillis();
            //Long timeProsess = endProcess-start;
            LOGGER.info("Process duration: " + (endProcess-start) + "[ms]");
        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return result;
    }
}
