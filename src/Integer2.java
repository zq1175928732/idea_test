/**
 * @version 1.0
 * @author: Administrator
 * @Package ${package_name}
 * @ClassName: Integer2
 * @Description: ${todo}
 * @date 2020/6/3 19:01
 */
public class Integer2 {
    int s1=1;
    public  static int add1(int s1){
        return s1++;
    }
    public  static int add2(Integer s1){
       return s1++;
    }
    public  static int add3(){
       /* return (this.s1)++;*/
       return 0;
    }
    public static void main(String args[]){

        int r1=Integer2.add1(1);
        System.out.println(r1);
       /* System.out.println(s1);
        int r2=Integer2.add2(1);*/

    }
}
