/**
 * @version 1.0
 * @author: Administrator
 * @Package ${package_name}
 * @ClassName: Demo
 * @Description: ${todo}
 * @date 2020/6/14 18:46
 */
public class Demo
{
    public static void  exchange(int x,int y){
        int temp=x;
        x=y;
        y=temp;
    }
    public static void main(String args[]){
     /*String s="hello";
     if(s=="hello"){
         System.out.println("s=\"hello\"");
     }else {
         System.out.println("s!=\"hello\"");
     }*/
    /* int [][] arr=new int[][2];错误*/
  /*  int t1=2;
    int t2=3;
    exchange(t1,t2);
    System.out.println(t1);*/
     /* int x=5;
      System.out.println((x++)/3);*/
      /*String str="1234";
      int x=4;
      int y=5;
      str=str+(x+y);
      System.out.println(str);*/
      String foo="blue";
      Boolean[] bar=new Boolean[1];
      if(bar[0]){
          foo="green";
      }
    }
}
