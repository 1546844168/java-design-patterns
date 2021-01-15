package com.jiangfeng;

/**
 * 代理类，继承接口抽象类，并持有真实类。
 * 调用代理类，实质上是调用真实类。
 */
public class SubjectProxy extends Subject {

    protected RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
