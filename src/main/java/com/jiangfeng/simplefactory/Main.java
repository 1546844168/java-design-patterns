package com.jiangfeng.simplefactory;

/**
 * 描述:
 *
 * @author: 江峰
 * @create: 2020-12-28 18:27
 * @since: 2.20.1
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(OperationFactory.getOperation("+").getResult(2, 3));
        System.out.println(OperationFactory.getOperation("/").getResult(6, 3));
    }
}
