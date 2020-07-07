import java.util.HashMap;
import  java.util.Map;

/**
 * @version 1.0
 * @author: Administrator
 * @Package ${package_name}
 * @ClassName: MapTest
 * @Description: ${todo}
 * @date 2020/6/20 12:50
 */
public class MapTest {

    public static void main(String args[]){

        Map<byte[],String> map=new HashMap<byte[],String>();
        byte[] bts="abc".getBytes();
        map.put(bts,"abc");
        System.out.println(map.containsKey(bts));
        System.out.println(map.containsKey("abc".getBytes()));
        System.out.println(map.containsKey("abc"));
        System.out.println(bts);
        System.out.println("abc".getBytes());
        System.out.println("abc".getBytes().equals(bts));
    }
}
