import java.util.Scanner;

public class TimeComplexity {

    public static void main(String args[]){
        System.out.println(10+ 5); // O(1)
        Scanner s  = new Scanner(System.in);
        int  n =s.nextInt();
        for(int i=0;i<n;i++){} // O(n)

        for(int i=2;i<n;i=i*i){} // O(log(n))

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){


            }
        }

        for(int i=0;i<n;i++){

            System.out.println(1);// -- 1 unit of time
            int a = 10+i; // -- 1 unit of time
            // 2 units of time
        }

        //O(2*n*n + n + 10) - O(n*n)
        //O(n + m) n > m  - O(n)
        // 1 < log(n) < n < nlog(n) < n*n < n^3 < exp(n) < 2^n <


    }
}
