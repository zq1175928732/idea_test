/**
 * @version 1.0
 * @author: Administrator
 * @Package ${package_name}
 * @ClassName: TestString
 * @Description: ${todo}
 * @date 2020/6/20 13:02
 */
public class TestString {

    public static void main(String args[]){

        String s="aaa";
         s+="bbb";
         String c=new String("aaabbb");
         String b=new String("aaabbb");
         System.out.println(s.equals(c));
        System.out.println(s==c);
        System.out.println(s==new String("aaabbb"));
        System.out.println(s.equals("aaabbb"));
    }
}
