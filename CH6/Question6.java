import java.util.Scanner;

public class Question6 {
    public static void main(String argv[]){
        System.out.println("請輸入矩形的長與寬!");
        Scanner sc = new Scanner(System.in);
        System.out.println("長: ");
        int input1 = sc.nextInt();
        System.out.println("寬: ");
        int input2= sc.nextInt();
        int start = 0;
        String star = "";
        for (start = 0; start < input1; start++){
            star = star + "*";
        }
        for (start = 0; start < input2; start++){
            System.out.println(star);
        }
        sc.close();
        
    }
}
