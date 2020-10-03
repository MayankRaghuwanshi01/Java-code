import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int k, l;
        String string1="";
        String string2="";
        for (int i=0;i<rows;i++) {
            for (int j=0;j<i;j++) 
            {
                System.out.print("  ");
            }
            for (k=65;k<rows+65-i;k++) 
            {
                string1=Character.toString(k);
                System.out.print(string1+" ");
            }
            for (l=k-2;l>=65;l--)
            {
                string2=Character.toString(l);
                System.out.print(string2+" ");
            }
            System.out.println();
        }
    }
}