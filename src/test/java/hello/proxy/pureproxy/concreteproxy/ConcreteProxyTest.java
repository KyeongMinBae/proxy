package hello.proxy.pureproxy.concreteproxy;

import hello.proxy.pureproxy.concreteproxy.code.ConcoreteLogic;
import hello.proxy.pureproxy.concreteproxy.code.ConcreteClient;
import org.junit.jupiter.api.Test;

public class ConcreteProxyTest {

    @Test
    void noProxy() {
        ConcoreteLogic concoreteLogic = new ConcoreteLogic();
        ConcreteClient client = new ConcreteClient(concoreteLogic);
        client.execute();
    }
}
