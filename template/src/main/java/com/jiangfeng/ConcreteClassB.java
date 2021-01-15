package com.jiangfeng;

public class ConcreteClassB extends TemplateClass {
    @Override
    public void primitiveOperationA() {
        System.out.println("primitiveOperationA in ConcreteClassB");
    }

    @Override
    public void primitiveOperationB() {
        System.out.println("primitiveOperationB in ConcreteClassB");
    }
}