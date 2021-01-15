package com.jiangfeng;

import java.util.Objects;

/**
 * 描述: 操作符运算工厂类
 *
 * @author: 江峰
 * @create: 2020-12-28 17:30
 * @since: 2.20.1
 */

public class OperationFactory {

    public static Operation getOperation(String str) {
        if (Objects.isNull(str)) {
            throw new NullPointerException("str can not bu null");
        }
        switch (str) {
            case "+":
                return new OperationAdd();
            case "/":
                return new OperationDiv();
            default:
                throw new IllegalArgumentException(" str 操作符 值没有匹配到");
        }

    }
}
