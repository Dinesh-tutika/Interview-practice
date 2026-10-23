import java.util.*;
public class Arr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" Elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l=0,r=n-1;
        while (l<r) {
            int t=arr[l];
            arr[l]=arr[r];
            arr[r]=t;
            l++;
            r--;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }

    }
}
