import java.util.Scanner;

public class Question6 {
    public static void main(String argv[]){
        System.out.println("請先創造一組密碼(介於1000~9999): ");
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        System.out.println("確認密碼: ");
        int input2 = sc.nextInt();
        if (input1 >= 1000 && input2 >= 1000 && input1 <= 9999 && input2 <= 9999 && input2 == input1){
            System.out.println("密碼正確");
        }
        else{
            System.out.println("密碼錯誤");
        }
        sc.close();
    }
}
