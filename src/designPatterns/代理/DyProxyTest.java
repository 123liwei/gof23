package designPatterns.代理;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
public class DyProxyTest {

    public static void main(String[] args) {

        Subject subject = new RealSubject();

        InvocationHandler handler = new ProxyHandler(subject);

        Subject proxySubject = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);

        proxySubject.request();

    }

}

class ProxyHandler implements InvocationHandler{


    private Object object;

    public ProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preRequest();
        method.invoke(object, args);
        postRequest();
        return null;
    }

    public void preRequest()
    {
        System.out.println("访问真实主题之前的预处理。");
    }
    public void postRequest()
    {
        System.out.println("访问真实主题之后的后续处理。");
    }
}
