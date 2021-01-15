package com.jiangfeng;

/**
 * 描述:
 *
 * @author: 江峰
 * @create: 2020-12-28 18:16
 * @since: 2.20.1
 */
public class OperationAdd extends Operation {

    @Override
    public int getResult(int numA, int numB) {
        return numA + numB;
    }
}
