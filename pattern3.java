import java.io.*;
import java.util.*;
class pattern3
    {
        public void main()
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int i = 1;
            while(i<= n)
            {
                int j = 1;
                while(j <= n-i)
                {
                    System.out.print(" ");
                    j++;
                }
                j= 1;
                while(j<=i)
                {
                    System.out.print("* ");
                    j++;
                }
                System.out.println(" ");
                i++;
            }
        }
    }
    
            