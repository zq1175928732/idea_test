/**
 * @version 1.0
 * @author: Administrator
 * @Package ${package_name}
 * @ClassName: Parent
 * @Description: ${todo}
 * @date 2020/6/3 19:34
 */
public class Parent {
    static {
        System.out.println("p static");
    }
    public static void printHello(String s){
        System.out.println("s"+s);
    }
    public  void print(String s){
        System.out.println(s);

    }
}
