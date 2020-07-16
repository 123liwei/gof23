package designPatterns.桥接;

public class BridgeTest {

    public static void main(String[] args) {

        Implementor imple=new ConcreteImplementorA();
        Abstraction abs=new RefinedAbstraction(imple);
        abs.Operation();

    }

}

interface Implementor{
    public void OperationImpl();
}

class ConcreteImplementorA implements Implementor{

    @Override
    public void OperationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }
}

abstract class Abstraction{
    protected  Implementor imple;

    protected Abstraction(Implementor imple) {
        this.imple = imple;
    }

    public abstract void Operation();
}

class RefinedAbstraction extends Abstraction{

    public RefinedAbstraction(Implementor imple) {
        super(imple);
    }

    @Override
    public void Operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问" );
        imple.OperationImpl();
    }
}