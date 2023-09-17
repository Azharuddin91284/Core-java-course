//Fibonacci series without using  reccursion 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 61 987 1597 2584 4181
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int n1=0,n2=1,i,n,count=20;
        System.out.println(n1+"\n"+n2);
        for(i=2;i<count;i++){
            n=n1+n2;
            n1=n2;
            n2=n;
            System.out.println(" "+n);
            
        }

    }
    
}
