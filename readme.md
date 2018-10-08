https://blog.csdn.net/dgeek/article/details/76221746

# Guava 学习：

**基本工具用法：**

集合 [collections] 、缓存 [caching] 、原生类型支持 [primitives support] 、并发库 [concurrency libraries] 、通用注解 [common annotations] 、字符串处理 [string processing] 、I/O 等

## 基本工具包：

**Optionals**（可选类）

个人理解： 泛型引用是否为null。空的话，采用or、get 方式进行替代。

Optional 表示 可能为null 的T 类型的引用。一个Optional 表示可能为null 的T 类型引用。一个Optional 实例可能含有非null 的应用，则记为引用存在。不存在则表示应用缺失。

采用Optional 的or 若是判断为isPresent 为true 的，则表示引用存在，这样的话， 可以直接用get, or方法用于引用不存在的时候。

**Preconditions**（先决条件）

前端传来数据进行处理。

前置条件： Preconditions 提供静态方法来检查方法或者构造函数，被调用是否给定适当的参数。它检查的先决条件，其方法失败跑出**IllegalArgumentException**（非法参数异常）。

checkArgument()

checkNotNull;

checkElementIndex;

#### Joiner（连接器）

Joiner 提供了各种方法来处理字符串加入操作，对象等。Joiner 实例对象不可变从而线程是安全的。

#### Splitter（切分器）

Splitter 能够将一个字符串按照指定的分隔符拆分成可迭代遍历的字符串集合，Iterable

#### EventBus（事件总线）

提供事件总线EventBus 库， 基于事件发布-订阅模式的实现，让我们能在领域驱动设计中以事件的弱引用本质对模块和领域边界进行很好的解耦设计。

Guava为我们提供了同步事件EventBus和异步实现AsyncEventBus两个事件总线，他们都不是单例的。

Guava发布的事件默认不会处理线程安全的，但我们可以标注@AllowConcurrentEvents来保证其线程安全

如果Listener A监听Event A, 而Event A有一个子类Event B, 此时Listener A将同时接收Event A和B消息。

考虑事件、订阅、一个事件被多个订阅者订阅。

**DeadEvent**

如果EventBus发送的消息都不是订阅者关心的称之为Dead Event。

### Collection

#### 不可变集合

不可变对象有很多优点，包括：

- 当对象被不可信的库调用时，不可变形式是安全的；
- 不可变对象被多个线程调用时，不存在竞态条件问题
- 不可变集合不需要考虑变化，因此可以节省时间和空间。所有不可变的集合都比它们的可变形式有更好的内存利用率（分析和测试细节）；
- 不可变对象因为有固定不变，可以作为常量来安全使用。

创建不可变集合方法：

copyOf 方法：

of 方法：



