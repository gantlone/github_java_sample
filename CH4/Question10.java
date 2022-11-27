import java.util.Scanner;

public class Question10 {
    public static void main(String argv[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入攝氏溫度: ");
        double input = sc.nextDouble();
        System.out.println("\n" + "華氏溫度為: " + ((input) * 9/5 + 32));
    }
}
