package day02;

/**
 * @ClassName StringTest02
 * @Description TODO
 * @Author 86180
 * @Date 2020/10/21
 **/
public class StringTest02 {
    public static void main(String[] args) {
        String s1="abc";
        String s2=new String("abc");
        byte[] bytes ={97,98,99,100};
        String s3=new String(bytes);
        System.out.println(s3);
        String s4 =new String(bytes,1,2);
        System.out.println(s4);
        char[] c1={'我','是','中','国','人'};
        String s5=new String(c1);
        System.out.println(s5);
        String s6 =new String(c1,2,2);
        System.out.println(s6);
    }
}
