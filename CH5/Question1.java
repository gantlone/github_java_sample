import java.util.Scanner;

public class Question1{
    public static void main(String argv[]){
        System.out.println("請輸入整數數字: \n");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input%2==0){
            System.out.println("偶數");
        }
        else{
            System.out.println("奇數");
        }

    }

}