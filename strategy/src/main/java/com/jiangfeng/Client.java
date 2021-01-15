package com.jiangfeng;

/**
 * Author: yeyouluo
 * Date: 2018/7/9
 */
public class Client {
    public static void main(String[] args) {
        com.jiangfeng.Strategy strategy = new com.jiangfeng.ConcretStratrgyB();
        com.jiangfeng.Context context = new com.jiangfeng.Context(strategy);
        context.contextInterface();
    }
}
