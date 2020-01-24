import java.util.Scanner;
public class again{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int arr [][] = new int [row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Average of each row");
        for(int i=0;i<row;i++){
            double ans=0;
            for(int j=0;j<column;j++){
                ans+=arr[i][j];
            }
            ans=ans/column;
            System.out.printf("%.2f ",ans);
           
        }
        System.out.println("");
        System.out.println("Average of each column");
        for(int i=0;i<column;i++){
            double ans=0;
            for(int j=0;j<row;j++){
                ans+=arr[j][i];
            }
            ans=ans/row;
            System.out.printf("%.2f ",ans);
        }


    }
}