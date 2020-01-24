import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

import java.util.Arrays;
public class ha{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        double [] arr = new double [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        Arrays.sort(arr);
        for(int i=0;i<n/2;i+=2){
            double a=0;
            a=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=a;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}