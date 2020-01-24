import java.util.Scanner;
public class average{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int row =sc.nextInt();
        int column = sc.nextInt();
        double arr [][] = new double [row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j] =sc.nextDouble();
            }
        }
        double ans;
        System.out.println("Average of each row:");
        for(int i=0;i<row;i++){
            ans=0;
            for(int j=0;j<column;j++){
                ans+=arr[i][j];
                


            }
            
            System.out.printf("%.2f ",ans/column);
            
        }System.out.println("");
        System.out.println("Average of each column:");
        for(int i=0;i<column;i++){
            ans=0;
            for(int j=0;j<row;j++){
                ans+=arr[j][i];
                


            }
            
            System.out.printf("%.2f ",ans/row);
        }
    }
}