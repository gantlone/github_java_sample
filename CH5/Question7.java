import java.util.Scanner;

public class Question7 {
    public static void main(String argv[]){
        System.out.println("請輸入使用者通話時間(分鐘): ");
        Scanner sc = new Scanner(System.in);
        double input1 = sc.nextDouble();
        if (input1 < 800){
            System.out.println("通話費用: " + (Math.floor(input1) * 0.9) + "元");           
        }
        else if (input1 >= 800 && input1 <= 1500){
            System.out.println("通話費用: " + Math.floor(input1) * 0.9 * 0.9 + "元");  
        }
        else if (input1 > 1500){
            System.out.println("通話費用: " + Math.floor(input1) * 0.9 * 0.79 + "元");  
        }
        else{
            System.out.println("輸入錯誤");  
        }
        sc.close();
    }
}
