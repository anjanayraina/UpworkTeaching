import java.util.Scanner;

public class ArraySpan {
    public static void findDifference(int[] arr){
        int MAX = Integer.MIN_VALUE;
        int MIN = Integer.MAX_VALUE;



        for(int i=0;i<arr.length;i++){
            if(arr[i]>MAX){
                MAX = arr[i];
            }
            if(arr[i]<MIN){
                MIN = arr[i];
            }
        }



        System.out.println(MAX-MIN);



    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int a[]  = new int[n];
        for(int i=0;i<n;i++){

            a[i] = s.nextInt();
        }
        findDifference(a);
    }
}
