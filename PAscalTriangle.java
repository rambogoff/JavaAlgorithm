package jaasimple;
import java.util.Scanner;
public class PAscalTriangle {
    public static void main(String [] args){
        int r, i, k ,num ,j;
        Scanner scan = new Scanner(System.in);
        System.out.print(" Girmek istediğiniz sayi : ");
        r = scan.nextInt();
        
        for(i = 0; i < r ; i++)
        {
            for( k = r; k > i;k--) // bosluk sayısı 
            {
                System.out.print(" ");
            }
            num = 1;
            
            for (j = 0; j <= i; j++)
            {
                System.out.print(num + " ");
                num = num *(i - j) / (j + 1);                
            }
            System.out.println();
        }
    }
    
}