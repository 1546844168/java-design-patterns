package com.jiangfeng;

public interface Strategy {
    public void algorithmInterface();
}

class ConcretStratrgyA implements Strategy {

    public void algorithmInterface() {
        System.out.println("策略A的具体实现！");
    }
}

class ConcretStratrgyB implements Strategy {

    public void algorithmInterface() {
        System.out.println("策略B的具体实现！");
    }
}

class ConcretStratrgyC implements Strategy {

    public void algorithmInterface() {
        System.out.println("策略C的具体实现！");
    }
}

