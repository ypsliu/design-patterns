/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 21:36
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第05章_抽象工厂模式.第3节_抽象工厂模式与实现;

public class ConcreteProductA2 implements AbstractProductA {
    @Override
    public void getInfo() {
        System.out.println("我是产品A2");
    }
}
