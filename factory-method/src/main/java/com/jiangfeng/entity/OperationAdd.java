package com.jiangfeng.entity;

public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
