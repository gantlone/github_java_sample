import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class Question8 {
    public static void main(String argv[]){
        System.out.println("請先選擇性別(1.男性 2.女性): ");
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        System.out.println("請輸入身高: ");
        double input2 = sc.nextDouble();
        if (input2 > 0 && input2 < 999){
            switch (input1){
                case 1:
                    System.out.println("男性標準體重: " + ((input2 - 80) * 0.7));
                    break;
                case 2:
                    System.out.println("女性標準體重: " + ((input2 - 70) * 0.6));
                    break;
                default:
                    System.out.println("輸入錯誤");
                    break;
            }
        }
    }
}
