import java.util.Scanner;
import java.util.Arrays;
public class Array{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        double [] arr = new double [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
                int i=0;
                int j=n-1;
                Arrays.sort(arr);
            while(i<j){
                double temp;
                
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i+=2;
                j-=2;
            
            }
            for(int y=0;y<n;y++){
                System.out.print(arr[y]+" ");
            }
    }
}