package com.jiangfeng;


import com.jiangfeng.entity.Operation;

public class Client {
    public static void main(String[] args) {
        OperationFactory factory = new DivFactory();
        Operation operation = factory.createOperation();

        operation.setNumberA(100);
        operation.setNumberB(20);

        System.out.println(operation.getResult());
    }
}
