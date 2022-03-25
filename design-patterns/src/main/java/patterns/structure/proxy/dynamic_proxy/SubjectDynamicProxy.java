package patterns.structure.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;

public class SubjectDynamicProxy extends DynamicProxy{

    public static <T> T newProxyInstance(Subject subject){
        //获取ClassLoader
        ClassLoader loader = subject.getClass().getClassLoader();
        //获取接口数组
        Class<?>[] classes = subject.getClass().getInterfaces();
        //获取handler
        InvocationHandler handler = new MyInvocationHandler(subject);

        return newProxyInstance(loader, classes, handler);
    }
}
