import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(m==1||m==2){
            System.out.println("NEWBIE!");
        }else if(m <= n){
            System.out.println("OLDBIE!");
        }else{
            System.out.println("TLE!");
            //Time Limit Exceeded
        }
    }
}
