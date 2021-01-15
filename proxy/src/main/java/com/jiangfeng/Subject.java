package com.jiangfeng;

/**
 * 为真实类和代理类提供共同的接口
 */
public abstract class Subject {
    public abstract void request();
}

/**
 * 真实类
 */
class RealSubject extends Subject {

    @Override
    public void request() {
        System.out.println("real subject request");
    }
}

