/***********************************************************
 * @Description : 
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/4/19 08:21
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package chapter03principles.p06liskovsubstitution;

public class Rectangle {
    private Long length;
    private Long width;

    public Rectangle() {
    }

    public Rectangle(Long length, Long width) {
        this.length = length;
        this.width = width;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }
}
