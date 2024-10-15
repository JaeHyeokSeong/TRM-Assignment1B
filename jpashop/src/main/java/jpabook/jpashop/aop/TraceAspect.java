package jpabook.jpashop.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class TraceAspect {

    @Around("@annotation(jpabook.jpashop.annotation.Trace) || @within(jpabook.jpashop.annotation.Trace)")
    public Object doTrace(ProceedingJoinPoint joinPoint) throws Throwable {
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        log.info("[trace begin]={}, args={}", signature, args);

        try {
            Object result = joinPoint.proceed();
            log.info("[trace end]={}, args={}", signature, args);
            return result;
        } catch (Exception e) {
            log.info("[trace exception]={}, args={}", signature, args);
            throw e;
        }
    }
}
