package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.task.TaskDecorator;

public class MyTaskDecorator implements TaskDecorator {
    private static final Logger logger = LoggerFactory.getLogger(MyTaskDecorator.class);

    @Override
    public Runnable decorate(Runnable runnable) {
        logger.info("hi,...... this is in my task decorator");
        return () -> runnable.run();
    }
}
