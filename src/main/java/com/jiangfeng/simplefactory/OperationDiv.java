package com.jiangfeng.simplefactory;

/**
 * 描述:
 *
 * @author: 江峰
 * @create: 2020-12-28 18:35
 * @since: 2.20.1
 */
public class OperationDiv extends Operation {

    @Override
    public int getResult(int numA, int numB) {
        if (numB == 0) {
            throw new ArithmeticException("除数不能为零");
        }
        return numA / numB;
    }
}
