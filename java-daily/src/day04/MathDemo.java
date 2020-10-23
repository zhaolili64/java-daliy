package day04;
import java.sql.SQLOutput;
/**
 * @ClassName MathDemo
 * @Description TODO
 * @Author 86180
 * @Date 2020/10/23
 **/
public class MathDemo {
    public static void main(String[] args) {

        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));

        System.out.println(Math.abs(-2.5));

        System.out.println("==================");


        System.out.println(Math.ceil(3.9));
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.ceil(3.0));
        System.out.println("==================");
        System.out.println(Math.floor(30.1));
        System.out.println(Math.floor(30.9));
        System.out.println(Math.floor(31.0));
        System.out.println("==================");

        System.out.println(Math.round(20.4));
        System.out.println(Math.round(10.5));

        int count = 0;
        double min = -10.8;
        double max = 5.9;

        for (int i = (int) min; i < max; i++) {
            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("总共有：" + count + "个");
    }
}
