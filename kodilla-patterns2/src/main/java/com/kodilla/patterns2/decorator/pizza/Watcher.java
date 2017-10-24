package com.kodilla.patterns2.decorator.pizza;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component("pizzaWatcher")
public class Watcher {
    public static final Logger LOGGER = LoggerFactory.getLogger(Watcher.class);

    @Before("execution(* com.kodilla.patterns2.decorator.pizza.BasicPizza.getRecipe(..))")
    public void logEvent() {
        LOGGER.info("Decorator added");
    }
}
