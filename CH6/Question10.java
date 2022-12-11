import java.util.Scanner;

public class Question10 {
    public static void main(String argv[]){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        double n = sc.nextInt();
        double ii = 0;double sum = 0;
        for (double i = n; i >= 1; i--){
           ii += 1; 
           sum = sum + (x + ii)/i;
        }
        System.out.println(sum);
    }
}
