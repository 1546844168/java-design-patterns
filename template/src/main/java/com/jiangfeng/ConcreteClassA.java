package com.jiangfeng;

public class ConcreteClassA extends TemplateClass {
    @Override
    public void primitiveOperationA() {
        System.out.println("primitiveOperationA in ConcreteClassA");
    }

    @Override
    public void primitiveOperationB() {
        System.out.println("primitiveOperationB in ConcreteClassA");
    }
}
