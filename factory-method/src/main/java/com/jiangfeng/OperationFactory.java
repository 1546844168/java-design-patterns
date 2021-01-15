package com.jiangfeng;

import com.jiangfeng.entity.*;

public interface OperationFactory {
    public Operation createOperation();
}

class AddFactory implements OperationFactory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}

class SubFactory implements OperationFactory {

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}

class MulFactory implements OperationFactory {

    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}

class DivFactory implements OperationFactory {

    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}