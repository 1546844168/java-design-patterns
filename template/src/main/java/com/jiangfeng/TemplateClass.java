package com.jiangfeng;

public abstract class TemplateClass {
    public abstract void primitiveOperationA();

    public abstract void primitiveOperationB();

    public void templateFunc() {
        System.out.println("templateFunc begin");

        primitiveOperationA();
        primitiveOperationB();

        System.out.println("templateFunc end");
    }
}
