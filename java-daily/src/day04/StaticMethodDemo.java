package day04;

/**
 * @ClassName StaticMethodDemo
 * @Description TODO
 * @Author 86180
 * @Date 2020/10/23
 **/
public class StaticMethodDemo {
    public static void main(String[] args) {
        //创建对象
        StaticMethodClass obj = new StaticMethodClass();
        obj.method();
        //正确但不推荐
        obj.methodStatic();
        //调用静态方法的推荐示例
        StaticMethodClass.methodStatic();

        //调用本类的静态方法
        myMethod();
        //等效写法
        StaticMethodDemo.myMethod();
    }

    public static void myMethod() {
        System.out.println("自己的方法!");
    }
}
