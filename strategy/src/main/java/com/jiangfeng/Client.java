package com.jiangfeng;

public class Client {
    public static void main(String[] args) {
        Strategy strategy = new ConcretStratrgyB();
        Context context = new Context(strategy);
        context.contextInterface();
    }
}
