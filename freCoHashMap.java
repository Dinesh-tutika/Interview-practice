import java.util.*;
public class freCoHashMap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,1,2,1,1,3,4};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i, map.getOrDefault(0,i)+1);
        }
        System.out.print(map);
    }
}
