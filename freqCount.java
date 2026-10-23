import java.util.*;
public class freqCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int flag=0;
        for(int i=0;i<str.length();i++){
            int c=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j))c++;
            }
            if(c>1){
                System.out.println(str.charAt(i));
                flag=1;
                break;
            }
            if(c==1){
                System.out.println(str.charAt(i));
                break;
            }
        }
        if(flag==0)System.out.println("No repeating characters");

    }
}
