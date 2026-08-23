package hello.proxy.pureproxy.concreteproxy;

import hello.proxy.pureproxy.concreteproxy.code.ConcreteLogic;
import hello.proxy.pureproxy.concreteproxy.code.ConcreteClient;
import hello.proxy.pureproxy.concreteproxy.code.TimeProxy;
import org.junit.jupiter.api.Test;

public class ConcreteProxyTest {

    @Test
    void noProxy() {
        ConcreteLogic concoreteLogic = new ConcreteLogic();
        ConcreteClient client = new ConcreteClient(concoreteLogic);
        client.execute();
    }

    @Test
    void addProxy() {
        ConcreteLogic concoreteLogic = new ConcreteLogic();
        TimeProxy timeProxy = new TimeProxy(concoreteLogic);
        ConcreteClient client = new ConcreteClient(timeProxy);
        client.execute();
    }
}
