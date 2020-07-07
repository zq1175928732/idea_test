/**
 * @version 1.0
 * @author: Administrator
 * @Package ${package_name}
 * @ClassName: Integer1
 * @Description: ${todo}
 * @date 2020/6/3 18:54
 */
public class Integer1 {

    public static void main(String args[]){
     int s1=new Integer(1);
     Integer s2=new Integer(1);
     Integer s3=new Integer(1);
     System.out.println(s1==s2);
     System.out.println(s2==s3);
     System.out.println(s2.equals(s3));

    }

}
