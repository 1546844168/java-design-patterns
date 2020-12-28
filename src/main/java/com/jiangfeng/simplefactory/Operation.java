package com.jiangfeng.simplefactory;

/**
 * 描述:
 *
 * @author: 江峰
 * @create: 2020-12-28 18:14
 * @since: 2.20.1
 */
public abstract class Operation {
    private int numA;
    private int numB;

    public abstract int getResult(int numA, int numB);
}
