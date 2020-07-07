/**
 * @version 1.0
 * @author: Administrator
 * @Package ${package_name}
 * @ClassName: ValueTransfer
 * @Description: ${todo}
 * @date 2020/6/20 13:09
 */
public class ValueTransfer {

    public static void main(String args[]){

        String s=new String("hello");
         modify(s);
         System.out.println(s);
    }


    public static void modify(String s){

        s+="world";
    }



}
