package com.Seafish.RPC.registry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 本地注册中心
 */
public class LocalhostRegistry {

    /**
     * 注册信息存储
     */
    private static final Map<String, Class<?>> map = new ConcurrentHashMap<>();

    /**
     * 获取服务
     *
     * @param serviceName
     * @param ImplName
     */
    public static void registry(String serviceName, Class<?> ImplName){
        map.put(serviceName, ImplName);
    }

    /**
     * 获取服务
     *
     * @param serviceName
     * @return
     */
    public static Class<?> get(String serviceName){
        return map.get(serviceName);
    }

    /**
     * 删除服务
     *
     * @param serviceName
     */
    public static void del(String serviceName){
        map.remove(serviceName);
    }
}
