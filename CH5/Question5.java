import java.util.Scanner;

public class Question5 {
    public static void main(String argv[]){
        System.out.println("請輸入想選擇的面積算法(1.三角形 2.矩形 3.梯形): ");
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        switch(input1){
            case 1:
                System.out.println("底: ");
                int input2 = sc.nextInt();
                System.out.println("高: ");
                int input3 = sc.nextInt();
                System.out.println("三角形面積: " + ((input2 * input3)/2));
                break;
            case 2:
                System.out.println("長: ");
                int input4 = sc.nextInt();
                System.out.println("寬: ");
                int input5 = sc.nextInt();
                System.out.println("矩形面積: " + (input4 * input5));
                break;
            case 3:
                System.out.println("上底: ");
                int input6 = sc.nextInt();
                System.out.println("下底: ");
                int input7 = sc.nextInt();
                System.out.println("高: ");
                int input8 = sc.nextInt();
                System.out.println("梯形面積: " + ((input6 + input7) * input8)/2);
                break;
            default:
                System.out.println("輸入錯誤");
                break;
            }
            sc.close();
    }
}
