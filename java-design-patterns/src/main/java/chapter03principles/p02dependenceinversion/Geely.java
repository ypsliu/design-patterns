/***********************************************************
 * @Description : 
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/3/10 19:49
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package chapter03principles.p02dependenceinversion;

public class Geely {
    public void studyImoocCourse(ICourse iCourse) {
        iCourse.studyCourse();
    }
}