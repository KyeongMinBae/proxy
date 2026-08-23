package hello.proxy.pureproxy.concreteproxy.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcoreteLogic {

    public String operation() {
        log.info("ConcreteLogic 실행");
        return "data";
    }
}
