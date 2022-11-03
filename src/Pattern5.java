import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int sp =n/2;
        int count =1;
        for(int i=0;i<n;i++){
            for(int j =0 ;j<sp;j++) System.out.print(" ");
            for(int j=0;j<count;j++) System.out.print("* ");
            if(i<n/2){

                sp--; // n/2 -i
                count+=2;
            }

            else{
                sp++;
                count-=2;
            }
            System.out.println();


        }
    }
}
