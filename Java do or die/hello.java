import java.util.Scanner;
public class hello{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        for(int i=0;i<num;i++){
            String text =sc.next().toLowerCase();
            text = text.substring(0,text.length()-1)+text.substring(text.length()-1).toUpperCase();
            for(int j=text.length()-1;j>=0;j--){
                System.out.print(text.charAt(j));
            }
            System.out.print(" ");
        }
        System.out.println();
        

    }
}