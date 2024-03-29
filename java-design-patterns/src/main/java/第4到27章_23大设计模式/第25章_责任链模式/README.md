# 第24章 责任链模式(chainofresponsibility)
> 主体类中包含一个指向当前类的方法
## 定义
+ 为请求创建一个接收此次请求对象的链
+ 类型：行为型

## 适用场景
+ 一个请求的处理需要多个对象当中的一个或几个协作处理

## 优点
+ 请求的发送者和接收者(请求的处理)解耦
+ 责任链可以动态组合

## 缺点
+ 责任链太长或者处理时间过程，影响性能
+ 责任链有可能过多

## 相关设计模式
+ 责任链模式和状态模式

## 应用
+ Tomcat：`javax.servlet.Filter/FilterChain`