原型模式虽然是创建型的模式，但是与工程模式没有关系
从名字即可看出，该模式的思想就是将一个**对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象**。
在Java中，**复制对象是通过clone()实现的，clone是java的本地native方法**



原型模式是指，创建一个原型对象，原型可以被拷贝成新的对象。
拷贝又分为深拷贝和浅拷贝
 - 深拷贝：为所有引用类型的成员变量申请新的内存空间，并复制该引用的对象。
 - 浅拷贝：基本数据类型的成员变量使用按值传递，而引用数据类型只是进行简单的引用传递，并没有真正创建一个新对象

如原型：Animal -> color（String） someObject（Object）

深拷贝 
Animal1 - color1 -> color1  someObject1 -> someObject1
Animal2 - color2 -> color2  someObject2 -> someObject2

浅拷贝：
Animal1 - color1 -> color1  someObject1 -> someObject
Animal2 - color2 -> color2  someObject2 -> someObject

当创建一个新对象比较复杂时，可以使用原型模式简化对对象的创建过程
不用重新初始化对象，而是动态的获取对象运行时的状态。
序列化实现深拷贝，虽然效率较低，不过推荐使用。