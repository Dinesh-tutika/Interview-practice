import java.util.*;
public class StrRev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int l=0,r=str.length()-1,flag=0;
        while (l<r) {
            if (str.charAt(l) != str.charAt(r)) {
                flag=1;
                break;
            }
            l++;
            r--;
        }
        if (flag == 0) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
    
}