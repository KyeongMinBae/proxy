package hello.proxy.pureproxy.concreteproxy.code;

public class ConcreteClient {

    private ConcoreteLogic concreteLogic;

    public ConcreteClient(ConcoreteLogic concreteLogic) {
        this.concreteLogic = concreteLogic;
    }

    public void execute() {
        concreteLogic.operation();
    }
}
