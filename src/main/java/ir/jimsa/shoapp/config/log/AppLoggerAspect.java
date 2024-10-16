package ir.jimsa.shoapp.config.log;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;

import static ir.jimsa.shoapp.utility.constant.ProjectConstants.LOG_DEFAULT_TIMEOUT;
import static ir.jimsa.shoapp.utility.constant.ProjectConstants.LOG_PATTERN;


@Aspect
@Component
@Slf4j
public class AppLoggerAspect {

    @Around("@annotation(be.jimsa.reddoctor.config.log.EvaluateExecuteTimeout)")
    public Object appLogger(ProceedingJoinPoint joinPoint) throws Throwable {
        Instant start = Instant.now();
        Object result = joinPoint.proceed();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        if (timeElapsed > LOG_DEFAULT_TIMEOUT) {
            log.error(LOG_PATTERN, joinPoint.getSignature().getName(), timeElapsed);
        } else {
            log.info(LOG_PATTERN, joinPoint.getSignature().getName(), timeElapsed);
        }
        return result;
    }
}
