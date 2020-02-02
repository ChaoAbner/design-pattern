建造者模式，也是一种创建对象的设计模式，用户只需指定特定的类型来创建对象，而用户不需要知道具体的细节

建造者模式的四个角色
 - productor(产品对象)：一个具体的产品对象
 - builder(抽象建造者)：创建一个product对象的各个部件的接口/抽象类
 - concreteBuilder(具体建造者)：实现接口，构建和装配部件
 - director(指挥者)：构建一个实现Builder接口的对象。用于创建具体的对象，并且完成构建产品过程
 
 