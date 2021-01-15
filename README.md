<<大话设计模式>> java语言版本


### 设计模式分类
        
- **创建型模式**：<u>*专注生产对象，不直接使用new*</u>
    - [简单工厂模式](https://github.com/1546844168/java-design-patterns/tree/master/simple-factory)
    - [工厂方法模式](https://github.com/1546844168/java-design-patterns/tree/master/factory-method)
    - [抽象工厂模式](https://github.com/1546844168/java-design-patterns/tree/master/abstract-factory)
    - [原型模式](https://github.com/1546844168/java-design-patterns/tree/master/prototype)
    - [建造者模式](https://github.com/1546844168/java-design-patterns/tree/master/builder)
    - [单例模式](https://github.com/1546844168/java-design-patterns/tree/master/singleton)
- **结构型模式**：*<u>关注类和对象的组合</u>*
    - [适配器模式](https://github.com/1546844168/java-design-patterns/tree/master/adapter)
    - [桥接模式](https://github.com/1546844168/java-design-patterns/tree/master/bridge)
    - [组合模式](https://github.com/1546844168/java-design-patterns/tree/master/composite)
    - [装饰器模式](https://github.com/1546844168/java-design-patterns/tree/master/decorator)
    - [外观模式](https://github.com/1546844168/java-design-patterns/tree/master/facade)
    - [享元模式](https://github.com/1546844168/java-design-patterns/tree/master/flyweight)
    - [代理模式](https://github.com/1546844168/java-design-patterns/tree/master/proxy)
- **行为模式（类行为型模式）**：*<u>关注对象之间的通信</u>*
    - [解释器模式](https://github.com/1546844168/java-design-patterns/tree/master/interpreter)
    - [模板方法模式](https://github.com/1546844168/java-design-patterns/tree/master/template)
- **行为模式（对象行为型模式）**：*<u>关注对象之间的通信</u>*
    - [策略模式](https://github.com/1546844168/java-design-patterns/tree/master/strategy)
    - [观察者模式](https://github.com/1546844168/java-design-patterns/tree/master/observer)
    - [状态模式](https://github.com/1546844168/java-design-patterns/tree/master/state)
    - [备忘录模式](https://github.com/1546844168/java-design-patterns/tree/master/memento)
    - [迭代器模式](https://github.com/1546844168/java-design-patterns/tree/master/iteractor)
    - [命令模式](https://github.com/1546844168/java-design-patterns/tree/master/command)
    - [责任链模式](https://github.com/1546844168/java-design-patterns/tree/master/responsibility-chain)
    - [中介者模式](https://github.com/1546844168/java-design-patterns/tree/master/mediator)
    - [访问者模式](https://github.com/1546844168/java-design-patterns/tree/master/visitor)

### 设计模式定义
1. 简单工厂模式：到底要实例化哪一个对象，将来会不会增加实例化的对下个，这是很容易变化的地方，通过一个单独的类来做这个实例化的过程，这就是工厂。

2. 策略模式：它定义了算法家族，分别封装起来，让他们之间可以相互转换，此模式让算法的变法，不会影响到使用算法的客户

3. 装饰模式：动态的给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更为灵活