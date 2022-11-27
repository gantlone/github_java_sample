import java.util.Scanner;

public class Question2 {
    public static void main(String argv[]){
        System.out.println("請輸入任意整數: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i=1; i<=input; i++){
            System.out.println(i + "*" + i + "=" + (Math.pow(i, 2)));
        }   
        sc.close();
    }
}
