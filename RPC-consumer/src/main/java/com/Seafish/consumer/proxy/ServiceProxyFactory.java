package com.Seafish.consumer.proxy;


import java.lang.reflect.Proxy;

/**
 * 服务代理工厂（用于创建代理对象）
 */
public class ServiceProxyFactory {

    /**
     * 根据服务类获取代理对象
     *
     * @param serviceClass
     * @return
     * @param <T>
     */
    /** Proxy.newProxyInstance(loader,interfaces,h)
     * loader:一个ClassLoader对象，定义了由哪个ClassLoader对象来对生成的代理对象进行加载
     * interfaces:一个Interface对象的数组，表示的是我将要给我需要代理的对象提供一组什么接口，如果我提供了一组接口给它，那么这个代理对象就宣称实现了该接口(多态)，这样我就能调用这组接口中的方法了
     * h:一个InvocationHandler对象，表示的是当我这个动态代理对象在调用方法的时候，会关联到哪一个InvocationHandler对象上
     */
    public static <T> T getProxy(Class<T> serviceClass){
        return serviceClass.cast(Proxy.newProxyInstance(
                serviceClass.getClassLoader(),
                new Class[]{serviceClass},
                new ServiceProxy()
        ));
    }
}
