package day04;

/**
 * @ClassName StaticMethodClass
 * @Description TODO
 * @Author 86180
 * @Date 2020/10/23
 **/
public class StaticMethodClass {
    /**
     * 成员变量
     */
    int num;
    /**
     * 静态变量
     */
    static int numStatic;

    /**
     * 成员方法
     */
    public void method() {
        System.out.println("这是一个成员方法");
        System.out.println(num);
        System.out.println(numStatic);
    }

    /**
     * 静态方法
     */
    public static void methodStatic() {
        System.out.println("这是一个静态方法.");
        System.out.println(numStatic);
    }
}
