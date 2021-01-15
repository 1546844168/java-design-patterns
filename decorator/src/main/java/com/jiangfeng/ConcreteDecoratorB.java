package com.jiangfeng;

public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operate() {
        super.operate();
        addedFunction();
    }

    private void addedFunction() {
        System.out.println("added fuction in ConcreteDecoratorB");
    }
}
