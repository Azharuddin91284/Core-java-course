import java.io.*;
public class Largest {
    static int Largestof(int x, int y, int z){
        if(x>y && x>z)
         return x;
         else if(y>x && y>z)
         return y;

         else
         return z;

   

    }
          public static void main(String[] args) {
            int a,b,c,largest;
            a=10;
            b=20;
            c=15;
            largest=Largestof(a,b,c);
            System.out.println(largest+ " Is a largest Number.");
         }
        
    
}
