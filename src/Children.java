/**
 * @version 1.0
 * @author: Administrator
 * @Package ${package_name}
 * @ClassName: Children
 * @Description: ${todo}
 * @date 2020/6/3 19:37
 */
public class Children extends Parent {
    static {
        System.out.println("c static");
    }
    public static void printHey(String s){
        System.out.println(s);
    }
    public static void main(String args[]){
        Children c=new Children();
        c.print("chello");
        Parent p=new Parent();
        p.print("phello");
    }

}
