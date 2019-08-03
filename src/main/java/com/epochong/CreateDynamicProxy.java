package com.epochong;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author epochong
 * @date 2019/7/31 17:00
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe 动态代理
 */
public class CreateDynamicProxy implements InvocationHandler {
    /**
     * 拿到targetObject
     */
    private Object targetObject;

    /**
     * 创建代理对象
     * 通过反射获取获取目标对象this.targetObject
     * this.targetObject.getClass().getInterfaces() --> this.targetObject实现的接口
     * newProxyInstance：反射实例化对象的方法
     * @param paramObj
     * @return
     */
    public Object createProxyObject(Object paramObj){
        this.targetObject = paramObj;
        return Proxy.newProxyInstance(this.targetObject.getClass().getClassLoader(),
                this.targetObject.getClass().getInterfaces(),
                this);
    }

    /**
     * 创建代理对象之后第一执行的方法， 就是invoke
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object resultObj = null;
        try {
            //所有的方法前调用安全检查，封装到了一起。如果是静态代理，需要在每个方法前面加
            this.checkSecurity();
            resultObj =  method.invoke(this.targetObject,args);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return resultObj;
    }

    //安全性检查
    public void checkSecurity(){
        System.out.println("=============checkSecurity()==============");
    }


}
