package com.jiangfeng;

/**
 * Author: yeyouluo
 * Date: 2018/7/9
 */
public class Context {

    private com.jiangfeng.Strategy strategy;

    public Context(com.jiangfeng.Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface() {
        strategy.algorithmInterface();
    }
}
